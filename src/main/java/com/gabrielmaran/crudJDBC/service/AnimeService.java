package com.gabrielmaran.crudJDBC.service;

import com.gabrielmaran.crudJDBC.dominio.Anime;
import com.gabrielmaran.crudJDBC.dominio.Producer;
import com.gabrielmaran.crudJDBC.repository.AnimeRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class AnimeService {
    private static final Logger log = LogManager.getLogger(com.gabrielmaran.crudJDBC.service.ProducerService.class);

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
        List<Anime> producers = AnimeRepository.findByNamePrepStatS(name);
        producers.forEach(a -> System.out.printf("[%d] - name: %s, episodes: %d, producer: %s %n", a.getIdAnime(), a.getName(), a.getEpisodes(), a.getProducer().getName()));
    }

    private static void deleteById() {
        System.out.println("Type the id of the anime you want to delete");
        int idToDelete = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? (Y/N)");
        String choice = SCANNER.nextLine();
        if (choice.toUpperCase().contains("Y")) {
            AnimeRepository.deleteById(idToDelete);
        } else {
            System.out.println("The deleting operation was cancelled");
        }

    }

    private static void save() {
        System.out.println("Type the anime name you want to save");
        String name = SCANNER.nextLine();
        System.out.println("Type the anime episodes");
        int episodes = SCANNER.nextInt();
        System.out.println("Type the id of the producer");
        int producerId = SCANNER.nextInt();
        Anime anime = Anime.AnimeBuilder.builder()
                .setName(name)
                .setEpisodes(episodes)
                .setProducer(Producer.ProducerBuilder.builder().id(producerId).build()).build();
        AnimeRepository.saveAnime(anime);
    }

    private static void update() {
        System.out.println("Type the id of the anime you want to update");
        int idToUpdate = SCANNER.nextInt();
        Optional<Anime> animeOptional = AnimeRepository.findById(idToUpdate);
        if (animeOptional.isEmpty()) {
            System.out.println("Anime not found");
            return;
        }
        System.out.println("Type the anime name you want to save");
        String name = SCANNER.nextLine();
        name = SCANNER.nextLine();
        System.out.println("Type the anime episodes");
        int episodes = SCANNER.nextInt();
        System.out.println("Type the id of the producer");
        int producerId = SCANNER.nextInt();
        Anime anime = Anime.AnimeBuilder.builder()
                .setIdAnime(idToUpdate)
                .setName(name)
                .setEpisodes(episodes)
                .setProducer(Producer.ProducerBuilder.builder().id(producerId).build()).build();
        AnimeRepository.update(anime);
        System.out.println("The new name of the producer was successfully updated");
    }
}
