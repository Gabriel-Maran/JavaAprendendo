package com.gabrielmaran.aprendendojbdc.repository;

import com.gabrielmaran.aprendendojbdc.conn.ConnectionFactory;
import com.gabrielmaran.aprendendojbdc.dominio.Producer;
import com.gabrielmaran.aprendendojbdc.listener.CustomRowSetListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProducerRepositoryRowSet {
    private static final Logger log = LogManager.getLogger(ProducerRepositoryRowSet.class);

    public static List<Producer> findByNameJdbcRowSet(String name) {
        String sql = "SELECT * FROM anime_store.producer WHERE name like ?;";
        List<Producer> producerList = new ArrayList<Producer>();
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1, "%" + name + "%");
            jrs.execute();
            while (jrs.next()) {
                Producer producer = Producer.ProducerBuilder.builder()
                        .id(jrs.getInt("idproducer"))
                        .nome(jrs.getString("name"))
                        .build();
                producerList.add(producer);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find producer: {} by name", name, e);
        }
        return producerList;
    }

    public static void updateRowSet(Producer producer) {
        log.info("Updating producer: {}", producer);
        String sql = "SELECT * FROM anime_store.producer WHERE (idproducer = ?)";
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute();
            if (!jrs.next()) return;
            jrs.updateString("name", producer.getNome());
            jrs.updateRow();
            log.info("Updated producer: {}", producer);
        } catch (SQLException e) {
            log.error("Error while trying to update producer: {} by name", producer, e);
        }
    }

    public static void updateCachedRowSet(Producer producer) {
        String sql = "SELECT * FROM producer WHERE (idproducer = ?)";
        try (CachedRowSet crs = ConnectionFactory.getCachedRowSet();
             Connection connection = ConnectionFactory.getConnection()) {
            connection.setAutoCommit(false);
            crs.setCommand(sql);
            crs.setInt(1, producer.getId());
            crs.execute(connection);
            if (!crs.next()) return;
            crs.updateString("name", producer.getNome());
            crs.updateRow();
            crs.acceptChanges();
            log.info("Updated producer: {}", producer);
        } catch (SQLException e) {
            log.error("Error while trying to update producer: {} by name", producer, e);
        }
    }
}
