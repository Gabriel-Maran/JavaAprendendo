package com.gabrielmaran.crudJDBC.repository;

import com.gabrielmaran.crudJDBC.conn.ConnectionFactory;
import com.gabrielmaran.crudJDBC.dominio.Producer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProducerRepository {
    private static final Logger log = LogManager.getLogger(ProducerRepository.class);

    public static List<Producer> findByNamePrepStatm(String name) {
        log.info("Finding by name: " + name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createFindNamePrepStatm(conn, name);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Producer producer = Producer.ProducerBuilder.builder()
                        .id(rs.getInt("idproducer"))
                        .nome(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find by name {}", name);
            throw new RuntimeException(e);
        }
        return producers;
    }

    private static PreparedStatement createFindNamePrepStatm(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "%" + name + "%");
        return ps;

    }

    public static void deleteById(int id) {
        log.info("Deleting by id: {}", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createDeleteIdPrepStatm(conn, id)) {
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                log.info("Successfully deleted by id: {}", id);
            } else {
                log.info("No producer find with id: {}", id);
            }
            log.info("Deleted by id: {}", id);

        } catch (SQLException e) {
            log.error("Error while trying to delete by id {}", id);
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createDeleteIdPrepStatm(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM anime_store.producer WHERE idproducer = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Producer producer) {
        log.info("Saving producer: {}", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createSavePrepStatm(conn, producer)) {
            ps.executeUpdate();
        } catch (SQLException e) {
            log.error("Error while trying to save producer {}", producer);
            throw new RuntimeException(e);
        }

    }

    private static PreparedStatement createSavePrepStatm(Connection conn, Producer producer) throws SQLException {
        String sql = "INSERT INTO anime_store.producer (name) VALUES(?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }

    public static Optional<Producer> findById(int id) {
        log.info("Finding by id: {}", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createFindByIdPrepStatm(conn, id);
             ResultSet rs = ps.executeQuery()) {
            if (!rs.next()) return Optional.empty();
            return Optional.of(Producer.ProducerBuilder.builder()
                    .id(rs.getInt("idproducer"))
                    .nome(rs.getString("name"))
                    .build());
        } catch (SQLException e) {
            log.error("Error while trying to find by id {}", id);
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createFindByIdPrepStatm(Connection conn, int id) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE idproducer = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void update(int id, Producer producer) {
        log.info("Updating producer: {}", producer);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createUpdatePrepStatm(conn, id, producer)) {
            ps.execute();
        } catch (SQLException e) {
            log.error("Error while trying to update producer {}", producer);
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createUpdatePrepStatm(Connection conn, int id, Producer producer) throws SQLException {
        String sql = "UPDATE anime_store.producer SET name = ? WHERE idproducer = ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, producer.getName());
        ps.setInt(2, id);
        return ps;
    }
}
