package com.gabrielmaran.aprendendojbdc.repository;

import com.gabrielmaran.aprendendojbdc.conn.ConnectionFactory;
import com.gabrielmaran.aprendendojbdc.dominio.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    public static void save(Producer producer) {
        String sql = "INSERT INTO `anime_store`.`producer` (`idproducer`, `name`) VALUES ('%d', '%s');".formatted(producer.getId(), producer.getNome());
        try (Connection conn = ConnectionFactory.getConnection();//try with resources se encarregad de fechar o conn e o stmt para vc
             Statement stmt = conn.createStatement()) {            //deixando o codigo mais limpo
            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
