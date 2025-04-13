package com.gabrielmaran.aprendendojbdc.repository;

import com.gabrielmaran.aprendendojbdc.conn.ConnectionFactory;
import com.gabrielmaran.aprendendojbdc.dominio.Producer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public static List<Producer> findALl() {
        log.info("Finding all producer in the DB");
        String sql = "SELECT idproducer, name FROM `anime_store`.`producer`;";
        return find(sql);
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding by name");
        String sql = "SELECT * FROM anime_store.producer WHERE name like '%%%s%%';".formatted(name);
        return find(sql);
    }

    private static List<Producer> find(String sql) {
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Producer producer = Producer.ProducerBuilder.builder()
                        .id(rs.getInt("idproducer"))
                        .nome(rs.getString("name"))
                        .build();
                producers.add(producer);
            }
            return producers;
        } catch (SQLException e) {
            log.error("Error while trying to find all producer", e);
        }
        return producers;
    }

    public static void showProducerMetaData() {
        log.info("Showing producer meta data");
        String sql = "SELECT * FROM `anime_store`.`producer`;";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            log.info("Coulmns count: ' {}'", metaData.getColumnCount());
            for (int i = 1; i <= columnCount; i++) {
                log.info("Table Name: ' {}'", metaData.getTableName(i));
                log.info("Column name: '{}'", metaData.getColumnName(i));
                log.info("Column size: '{}'", metaData.getColumnDisplaySize(i));
                log.info("Column type: '{}'", metaData.getColumnTypeName(i));
            }
        } catch (SQLException e) {
            log.error("Error while trying to show producer meta data", e);
        }
    }

    public static void showDriverMetaData() {
        log.info("Showing driver MetaData");
        String sql = "SELECT * FROM `anime_store`.`producer`;";
        try (Connection conn = ConnectionFactory.getConnection()) {
            DatabaseMetaData metaData = conn.getMetaData();
            if (metaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Suports TYPE_FORWARD_ONLY");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Suports CONCUR_READ_ONLY");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports SCROLL_INSENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Supports SCROLL_SENSITIVE");
                }
            }
            if (metaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports SCROLL_SENSITIVE");
                if (metaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And Supports SCROLL_SENSITIVE");
                }
            }


        } catch (SQLException e) {
            log.error("Error while trying to show driver meta data", e);
        }
    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM anime_store.producer;";
        try (Connection conn = ConnectionFactory.getConnection();
             Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            log.info("Is on last row? '{}'", rs.last());//Volta o ultimo
            log.info("Roll number '{}'", rs.getRow());
            log.info(Producer.ProducerBuilder.builder().id(rs.getInt("idproducer")).nome(rs.getString("name")).build());

            log.info("Is on First row? '{}'", rs.first());//Volta o primeiro
            log.info("Roll number '{}'", rs.getRow());
            log.info(Producer.ProducerBuilder.builder().id(rs.getInt("idproducer")).nome(rs.getString("name")).build());

            log.info("Row Absolute '{}'", rs.absolute(3));//Volta essa exata linha
            log.info("Roll number '{}'", rs.getRow());
            log.info(Producer.ProducerBuilder.builder().id(rs.getInt("idproducer")).nome(rs.getString("name")).build());

            log.info("Row Relative '{}'", rs.relative(-2));//Volta uma linha, ou avança, depende do num passado
            log.info("Roll number '{}'", rs.getRow());
            log.info(Producer.ProducerBuilder.builder().id(rs.getInt("idproducer")).nome(rs.getString("name")).build());

            log.info("is Last? '{}'", rs.isLast());//Verifica se é a ultima
            log.info("Roll number '{}'", rs.getRow());

            log.info("is First? '{}'", rs.isFirst());//Verifica se é a primeira
            log.info("Roll number '{}'", rs.getRow());

            rs.afterLast();
            log.info("After last row? '{}'", rs.isAfterLast());
            log.info("--------------------------------");
            while (rs.previous()) {
                log.info(Producer.ProducerBuilder.builder().id(rs.getInt("idproducer")).nome(rs.getString("name")).build());
            }

        } catch (SQLException e) {
            log.error("Error while trying to show type scroll working", e);
        }
    }
}

