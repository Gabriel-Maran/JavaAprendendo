package com.gabrielmaran.crudJDBC.repository;

import com.gabrielmaran.crudJDBC.conn.ConnectionFactory;
import com.gabrielmaran.crudJDBC.dominio.Anime;
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

public class AnimeRepository {
    private static final Logger log = LogManager.getLogger(ProducerRepository.class);

    public static List<Anime> findByNamePrepStatS(String name) {
        log.info("Find anime by name {}", name);
        List<Anime> animeList = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = createFindByNamePrepStat(connection, name);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Producer prod = Producer.ProducerBuilder.builder()
                        .nome(resultSet.getString("producer_name"))
                        .id(resultSet.getInt("producer_idproducer"))
                        .build();
                Anime anime = Anime.AnimeBuilder.builder()
                        .setIdAnime(resultSet.getInt("idanime"))
                        .setName(resultSet.getString("nome"))
                        .setEpisodes(resultSet.getInt("episodes"))
                        .setProducer(prod)
                        .build();
                animeList.add(anime);
            }
        } catch (SQLException e) {
            log.error("Error while trying to find anime by name: {}", name, e); // Use log.error para exceções
            throw new RuntimeException(e);
        }
        return animeList;
    }

    private static PreparedStatement createFindByNamePrepStat(Connection conn, String name) throws SQLException {
        String sql = """
                SELECT a.idanime, a.nome, a.episodes,  a.producer_id, p.idproducer AS producer_idproducer, p.name AS producer_name\s
                FROM anime_store.Anime a\s
                INNER JOIN anime_store.producer p ON a.producer_id = p.idproducer\s
                WHERE a.nome LIKE ?;
                """;
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "%" + name + "%");
        return ps;
    }

    public static void deleteById(int id) {
        log.info("Deleting anime by id {}", id);
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = createDeleteByIdPrepStat(connection, id)) {
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                log.info("Deleted anime with id {}", id);
            } else {
                log.info("No rows affected, user not founded");
            }
        } catch (SQLException e) {
            log.info("Error while trying to delete anime by id {}", id);
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createDeleteByIdPrepStat(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM anime_store.Anime WHERE idanime = ?;";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        return preparedStatement;
    }

    public static void saveAnime(Anime anime) {
        log.info("Trying to save anime {}", anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = creatSavePrepStat(conn, anime)) {
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            log.info("Error while trying to save anime {}", anime);
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement creatSavePrepStat(Connection conn, Anime anime) throws SQLException {
        String sql = "INSERT INTO anime_store.Anime(nome, episodes, producer_id) VALUES (?, ?, ?);";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, anime.getName());
        preparedStatement.setInt(2, anime.getEpisodes());
        preparedStatement.setInt(3, anime.getProducer().getId());
        return preparedStatement;
    }

    public static Optional<Anime> findById(int id) {
        log.info("Finding anime by id {}", id);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = createfindByIdPrepStat(conn, id);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            if (!resultSet.next()) return Optional.empty();
            Producer prod = Producer.ProducerBuilder.builder()
                    .nome(resultSet.getString("producer_name"))
                    .id(resultSet.getInt("producer_idproducer"))
                    .build();
            Anime anime = Anime.AnimeBuilder.builder()
                    .setIdAnime(resultSet.getInt("idanime"))
                    .setName(resultSet.getString("nome"))
                    .setEpisodes(resultSet.getInt("episodes"))
                    .setProducer(prod)
                    .build();
            return Optional.of(anime);
        } catch (SQLException e) {
            log.info("Error while trying to find anime by id {}", id);
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createfindByIdPrepStat(Connection conn, int id) throws SQLException {
        String sql = """
                SELECT a.idanime, a.nome, a.episodes,  a.producer_id, p.idproducer AS producer_idproducer, p.name AS producer_name\s
                FROM anime_store.Anime a\s
                INNER JOIN anime_store.producer p ON a.producer_id = p.idproducer\s
                WHERE a.idanime = ?;
                """;
        ;
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        return preparedStatement;
    }

    public static void update(Anime anime) {
        log.info("Updating anime {}", anime);
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = createUpdatePrepStat(conn, anime)) {
            preparedStatement.execute();
        } catch (SQLException e) {
            log.info("Error while trying to update anime {}", anime);
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement createUpdatePrepStat(Connection conn, Anime anime) throws SQLException {
        String sql = "UPDATE anime_store.Anime set nome = ?, episodes = ? where idanime = ?;";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, anime.getName());
        preparedStatement.setInt(2, anime.getEpisodes());
        preparedStatement.setInt(3, anime.getIdAnime());
        return preparedStatement;
    }
}
