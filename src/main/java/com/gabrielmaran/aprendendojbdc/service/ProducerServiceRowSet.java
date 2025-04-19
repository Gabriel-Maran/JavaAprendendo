package com.gabrielmaran.aprendendojbdc.service;

import com.gabrielmaran.aprendendojbdc.dominio.Producer;
import com.gabrielmaran.aprendendojbdc.repository.ProducerRepositoryRowSet;

import java.sql.SQLException;
import java.util.List;

public class ProducerServiceRowSet {
    public static List<Producer> findByNameJdbcRowSet(String name) {
        return ProducerRepositoryRowSet.findByNameJdbcRowSet(name);
    }

    public static void updateRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateRowSet(producer);
    }

    public static void getProducerCachedRowSet(Producer producer) {
        ProducerRepositoryRowSet.updateCachedRowSet(producer);
    }
}
