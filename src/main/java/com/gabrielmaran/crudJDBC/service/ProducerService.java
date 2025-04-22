package com.gabrielmaran.crudJDBC.service;

import com.gabrielmaran.crudJDBC.dominio.Producer;
import com.gabrielmaran.crudJDBC.repository.ProducerRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Scanner;

public class ProducerService {
    private static final Logger log = LogManager.getLogger(ProducerService.class);

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1:
                findByName();
                break;
            case 2:
                deleteById();
                break;
            default:
                throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        List<Producer> producers = ProducerRepository.findByNamePrepStatm(name);
        for (int i = 0; i < producers.size(); i++) {
            Producer producer = producers.get(i);
            System.out.printf("[%d] - ID: %d, name: %s;%n", i, producer.getId(), producer.getName());
        }
    }

    private static void deleteById() {
        System.out.println("Type the id of the producer you want to delete");
        int idToDelete = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? (S/N)");
        String choice = SCANNER.nextLine();
        if (choice.toUpperCase().contains("S")) {
            ProducerRepository.deleteById(idToDelete);
        } else {
            System.out.println("The deleting operation was cancelled");
        }

    }
}
