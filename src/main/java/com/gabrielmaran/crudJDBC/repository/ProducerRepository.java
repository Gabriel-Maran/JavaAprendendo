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
        log.info("Find by nanme prep statm: " + name);
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatement(conn, name);
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

    private static PreparedStatement createPreparedStatement(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer WHERE name like ?;";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "%" + name + "%");
        return ps;

    }
}
