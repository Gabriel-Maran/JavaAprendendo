package com.gabrielmaran.crudJDBC.service;

import com.gabrielmaran.crudJDBC.dominio.Producer;
import com.gabrielmaran.crudJDBC.repository.ProducerRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ProducerService {
    private static final Logger log = LogManager.getLogger(ProducerService.class);

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int escolha) {
        switch (escolha) {
            case 1 -> findByName();
            case 2 -> deleteById();
            case 3 -> save();
            case 4 -> update();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all");
        String name = SCANNER.nextLine();
        List<Producer> producers = ProducerRepository.findByNamePrepStatm(name);
        producers.forEach(p -> System.out.printf("[%d] - name: %s;%n", p.getId(), p.getName()));
    }

    private static void deleteById() {
        System.out.println("Type the id of the producer you want to delete");
        int idToDelete = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? (Y/N)");
        String choice = SCANNER.nextLine();
        if (choice.toUpperCase().contains("Y")) {
            ProducerRepository.deleteById(idToDelete);
        } else {
            System.out.println("The deleting operation was cancelled");
        }

    }

    private static void save() {
        System.out.println("Type the producer name you want to save");
        String name = SCANNER.nextLine();
        Producer producer = Producer.ProducerBuilder.builder().nome(name).build();
        ProducerRepository.save(producer);
    }

    private static void update() {
        System.out.println("Type the id of the producer you want to update");
        int idToUpdate = Integer.parseInt(SCANNER.nextLine());
        Optional<Producer> producerOptional = ProducerRepository.findById(idToUpdate);
        if(producerOptional.isEmpty()){
            System.out.println("Producer not found");
            return;
        }
        System.out.println("Type the new name of the producer");
        String newName = SCANNER.nextLine();
        newName = newName.isEmpty() ? producerOptional.get().getName() : newName;
        Producer updatedProducer = Producer.ProducerBuilder
                .builder().id(idToUpdate).nome(newName).build();
        ProducerRepository.update(idToUpdate, updatedProducer);
        System.out.println("The new name of the producer was successfully updated");
    }
}
