package com.gabrielmaran.aprendendojbdc.service;

import com.gabrielmaran.aprendendojbdc.dominio.Producer;
import com.gabrielmaran.aprendendojbdc.repository.ProducerRepository;

public class ProducerService {

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

    private static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("Id must be a positive integer");
        }
    }
}
