package com.gabrielmaran.aprendendojbdc.service;

import com.gabrielmaran.aprendendojbdc.dominio.Producer;
import com.gabrielmaran.aprendendojbdc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {

    public static void saveTransactionPrepStat(List<Producer> producers) {
        ProducerRepository.saveTransactionPrepStat(producers);
    }

    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(Integer id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static void updatePreparedStatement(Producer producer){
        requireValidId(producer.getId());
        ProducerRepository.updatePreparedStatement(producer);
    }

    public static List<Producer> findAll() {
        return ProducerRepository.findALl();
    }

    public static List<Producer> findByName(String name) {
        return ProducerRepository.findByName(name);
    }

    public static List<Producer> findByNameCallableStatement(String name) {
        return ProducerRepository.findByNameCallableStatement(name);
    }

    private static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Id must be a positive integer");
        }
    }

    public static void showProducerMetaData() {
        ProducerRepository.showProducerMetaData();
    }

    public static void showDriverMetaData() {
        ProducerRepository.showDriverMetaData();
    }

    public static void showTypeScrollWorking() {
        ProducerRepository.showTypeScrollWorking();
    }

    public static void findByNameAndUpdateToUpperCase(String nome) {
        ProducerRepository.findByNameAndUpdateToUppperCase(nome);
    }

    public static List<Producer> findByNameAndInsertWhenNotFound(String nome) {
        return ProducerRepository.findByNameAndInsertWhenNotFound(nome);
    }

    public static void findByNameAndRemove(String nome) {
        ProducerRepository.findByNameAndRemove(nome);
    }

    public static List<Producer> findByNamePreparedStetament(String nome) {
        return ProducerRepository.findByNamePreparedStatement(nome);
    }
}