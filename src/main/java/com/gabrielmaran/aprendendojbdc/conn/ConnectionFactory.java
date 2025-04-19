package com.gabrielmaran.aprendendojbdc.conn;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
    //java.sql = Connection, Statement, ResultSet, DriverManager
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "root";

        return DriverManager.getConnection(url, username, password);
    }

    public static JdbcRowSet getJdbcRowSet() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "root";
        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        jdbcRowSet.setUrl(url);
        jdbcRowSet.setUsername(username);
        jdbcRowSet.setPassword(password);
        return jdbcRowSet;
    }

    public static CachedRowSet getCachedRowSet() throws SQLException { //Pega os dados e desconecta do DB
//        String url = "jdbc:mysql://localhost:3306/anime_store";
//        String username = "root";
//        String password = "root";
        return RowSetProvider.newFactory().createCachedRowSet();
        // O problema é caso seja sincronizado com threads, ai teria que resolver(tratando)
        // ou refazer esta parte (mostrado mais para fins didaticos)
//        cachedRowSet.setUrl(url);
//        cachedRowSet.setUsername(username);
//        cachedRowSet.setPassword(password);
//        return cachedRowSet;
    }
}
