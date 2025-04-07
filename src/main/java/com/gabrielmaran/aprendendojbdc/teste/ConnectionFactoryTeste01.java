package com.gabrielmaran.aprendendojbdc.teste;

import com.gabrielmaran.aprendendojbdc.conn.ConnectionFactory;
import com.gabrielmaran.aprendendojbdc.dominio.Producer;
import com.gabrielmaran.aprendendojbdc.repository.ProducerRepository;

import java.sql.Connection;
import java.sql.Statement;

public class ConnectionFactoryTeste01 {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder()
                .id(2)
                .nome("ABC")
                .build();
        ProducerRepository.save(producer);
    }
}
