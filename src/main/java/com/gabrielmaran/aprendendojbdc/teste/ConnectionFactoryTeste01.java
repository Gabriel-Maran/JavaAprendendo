package com.gabrielmaran.aprendendojbdc.teste;

import com.gabrielmaran.aprendendojbdc.conn.ConnectionFactory;
import com.gabrielmaran.aprendendojbdc.dominio.Producer;
import com.gabrielmaran.aprendendojbdc.repository.ProducerRepository;
import com.gabrielmaran.aprendendojbdc.service.ProducerService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Statement;

public class ConnectionFactoryTeste01 {
    private static final Logger log = LogManager.getLogger(ConnectionFactoryTeste01.class);

    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder()
                .id(3)
                .nome("JJJJJJJJJJ")
                .build();
        ProducerService.save(producer);
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ProducerService.delete(producer.getId());

// Níveis de log (em ordem crescente de severidade):

// TRACE: Rastreamento detalhado do fluxo da aplicação (ex: entrada/saída de métodos).
//        Usado para DEBUG avançado. Geralmente desativado em produção.
//        log.trace("TRACE");

// DEBUG: Informações detalhadas para depuração (ex: valores de variáveis, estados internos).
//        Útil durante o desenvolvimento.
//        log.debug("DEBUG");

// INFO: Informações gerais sobre o funcionamento da aplicação (ex: "Servidor iniciado", "Usuário autenticado").
//        Usado para monitorar o fluxo normal.
//        log.info("INFO");

// WARN: Avisos sobre situações potencialmente problemáticas (ex: configuração incomum, recursos perto do limite).
//        A aplicação continua funcionando, mas merece atenção.
//        log.warn("WARN");

// ERROR: Erros que impactam funcionalidades específicas (ex: exceções, falha em operações críticas).
//        Requer intervenção, mas a aplicação pode continuar rodando parcialmente.
//        log.error("ERROR");

// FATAL: Erros graves que forçam o encerramento da aplicação (ex: perda de conexão com banco crítico).
//        Menos comum (em muitas implementações, usa-se ERROR para casos críticos).
//        log.fatal("FATAL"); // (Não mostrado no seu exemplo)
    }
}
