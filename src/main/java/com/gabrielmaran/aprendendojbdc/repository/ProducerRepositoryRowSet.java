package com.gabrielmaran.aprendendojbdc.repository;

import com.gabrielmaran.aprendendojbdc.conn.ConnectionFactory;
import com.gabrielmaran.aprendendojbdc.dominio.Producer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
}
