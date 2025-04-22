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
}
