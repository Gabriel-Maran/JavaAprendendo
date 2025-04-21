package com.gabrielmaran.crudJDBC.service;

import com.gabrielmaran.crudJDBC.dominio.Producer;
import com.gabrielmaran.crudJDBC.repository.ProducerRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static final Logger log = LogManager.getLogger(ProducerRepository.class);

    private static Scanner scanner = new Scanner(System.in);

    public static void buildMenu(int op) {
        switch (op) {
            case 1: findByName(); break;
            default:
                throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = scanner.nextLine();
        List<Producer> producers = ProducerRepository.findByNamePrepStatm(name);
        for (int i = 0; i < producers.size(); i++) {
            System.out.printf("[%d] - %s%n", i, producers.get(i).getName());
        }
    }
}
