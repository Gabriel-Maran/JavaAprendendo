package com.gabrielmaran.crudJDBC.repository;

import com.gabrielmaran.crudJDBC.conn.ConnectionFactory;
import com.gabrielmaran.crudJDBC.dominio.Anime;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnimeRepository {
    private static final Logger log = LogManager.getLogger(ProducerRepository.class);

    public static List<Anime> findByNamePrepStatS(String name) {
        log.info("Find anime by name {}", name);
        List<Anime> animeList = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement preparedStatement = createFindByNamePrepStat(connection, name);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                Anime anime = Anime.AnimeBuilder.builder()
                        .setName(name)
                        .build();
                animeList.add(anime);
            }

        } catch (SQLException e) {
            log.info("Error while trying to find anime by name: {}", name);
            throw new RuntimeException(e);
        }
        return animeList;
    }

    private static PreparedStatement createFindByNamePrepStat(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.Anime WHERE nome like ?;";
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
        String sql = "DELETE FROM anime_store.Anime WHERE id = ?;";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        return preparedStatement;
    }
}
