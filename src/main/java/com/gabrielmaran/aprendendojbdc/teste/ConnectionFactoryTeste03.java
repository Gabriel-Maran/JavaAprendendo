package com.gabrielmaran.aprendendojbdc.teste;

import com.gabrielmaran.aprendendojbdc.dominio.Producer;
import com.gabrielmaran.aprendendojbdc.service.ProducerService;

import java.util.List;

public class ConnectionFactoryTeste03 {
    public static void main(String[] args) {

        Producer producer1 = Producer.ProducerBuilder.builder().nome("NaoSeiQuem1").build();
        Producer producer2 = Producer.ProducerBuilder.builder().nome("NaoSeiQuem2").build();
        Producer producer3 = Producer.ProducerBuilder.builder().nome("NaoSeiQuem3").build();
        ProducerService.saveTransactionPrepStat(List.of(producer1, producer2, producer3));
    }
}
