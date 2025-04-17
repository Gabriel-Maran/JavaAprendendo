package com.gabrielmaran.aprendendojbdc.teste;

import com.gabrielmaran.aprendendojbdc.dominio.Producer;
import com.gabrielmaran.aprendendojbdc.repository.ProducerRepositoryRowSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ConnectionFactoryTeste02 {
    private static final Logger log = LogManager.getLogger(ProducerRepositoryRowSet.class);

    public static void main(String[] args) {
        List<Producer> producerList = ProducerRepositoryRowSet.findByNameJdbcRowSet("gabriel");
        log.info("Lista de producers com este nome {}", producerList);
    }
}
