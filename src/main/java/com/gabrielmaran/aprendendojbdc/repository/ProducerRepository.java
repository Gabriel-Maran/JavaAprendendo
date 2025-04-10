package com.gabrielmaran.aprendendojbdc.repository;

import com.gabrielmaran.aprendendojbdc.conn.ConnectionFactory;
import com.gabrielmaran.aprendendojbdc.dominio.Producer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    private static final Logger log = LogManager.getLogger(ProducerRepository.class);

    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`idproducer`, `name`) VALUES ('%d', '%s');".formatted(producer.getId(), producer.getNome());
        try (Connection conn = ConnectionFactory.getConnection();//try with resources se encarregad de fechar o conn e o stmt para vc
             Statement stmt = conn.createStatement()) {            //deixando o codigo mais limpo
            int rowsAffected = stmt.executeUpdate(sql);
            log.info("Inserted producer '{}' in the DB, rows affected: '{}'", producer.getNome(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to insert producer '{}'", producer.getNome(), e);
        }
    }

    public static void delete(int id) {
        String sqlDelete = "DELETE FROM `anime_store`.`producer` WHERE `idproducer` = '%d';".formatted(id);
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sqlDelete);
            log.info("Deleted producer '{}' in the DB, rows affected '{}", id, rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to delete producer '{}'", id, e);
        }
    }

    public static void update(Producer producer) {
        String sqlUpdate = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`idproducer` = '%d');"
                .formatted(producer.getNome(), producer.getId());
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sqlUpdate);
            log.info("Updated producer '{}' in the DB, rows affected '{}'", producer.getId(), rowsAffected);
        } catch (SQLException e) {
            log.error("Error while trying to update producer '{}'", producer.getNome(), e);
        }
    }
}
