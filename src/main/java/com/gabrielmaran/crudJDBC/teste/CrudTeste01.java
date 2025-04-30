package com.gabrielmaran.crudJDBC.teste;

import com.gabrielmaran.crudJDBC.service.AnimeService;
import com.gabrielmaran.crudJDBC.service.ProducerService;

import java.util.Scanner;

public class CrudTeste01 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int escolha;
        while (true) {
            menu();
            escolha = Integer.parseInt(SCANNER.nextLine());
            if (escolha == 0) break;
            switch (escolha) {
                case 1 -> {
                    producerMenu();
                    escolha = Integer.parseInt(SCANNER.nextLine());
                    ProducerService.menu(escolha);
                }
                case 2 -> {
                    animeMenu();
                    escolha = Integer.parseInt(SCANNER.nextLine());
                    AnimeService.menu(escolha);
                }
                case 0 -> System.out.println("Saindo...");
            }
        }
    }

    private static void menu() {
        System.out.println(" -------- Menu --------");
        System.out.println("Type the number of your operation:");
        System.out.println("  1. Producer ");
        System.out.println("  2. Anime ");
        System.out.println("  0. Exit ");
    }

    private static void producerMenu() {
        System.out.println(" ---- Producer Menu ----");
        System.out.println("Type the number of your operation:");
        System.out.println("  1. Serach for producer ");
        System.out.println("  2. Delete producer by ID ");
        System.out.println("  3. Save a new producer  ");
        System.out.println("  4. Update a producer by ID ");
        System.out.println("  9. Go back ");
    }

    private static void animeMenu() {
        System.out.println(" ---- Anime Menu ----");
        System.out.println("Type the number of your operation:");
        System.out.println("  1. Serach for anime ");
        System.out.println("  2. Delete anime by ID ");
        System.out.println("  3. Save a new anime  ");
        System.out.println("  4. Update a anime by ID ");
        System.out.println("  9. Go back ");
    }
}
