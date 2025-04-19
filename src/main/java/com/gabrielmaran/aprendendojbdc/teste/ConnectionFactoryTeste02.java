package com.gabrielmaran.aprendendojbdc.teste;

import com.gabrielmaran.aprendendojbdc.dominio.Producer;
import com.gabrielmaran.aprendendojbdc.repository.ProducerRepositoryRowSet;
import com.gabrielmaran.aprendendojbdc.service.ProducerServiceRowSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ConnectionFactoryTeste02 {
    private static final Logger log = LogManager.getLogger(ProducerRepositoryRowSet.class);

    public static void main(String[] args) {
        Producer producerUpdate = Producer.ProducerBuilder.builder()
                .id(1)
                .nome("SeiLa")
                .build();
        ProducerServiceRowSet.getProducerCachedRowSet(producerUpdate);
        log.info("-------------------------------------------");
        List<Producer> producerList = ProducerRepositoryRowSet.findByNameJdbcRowSet("a");
        log.info("Lista de producers com este nome {}", producerList);
    }
}
