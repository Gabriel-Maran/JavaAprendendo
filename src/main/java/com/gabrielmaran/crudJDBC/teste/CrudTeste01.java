package com.gabrielmaran.crudJDBC.teste;

import com.gabrielmaran.crudJDBC.service.ProducerService;
import com.gabrielmaran.crudJDBC.dominio.Producer;

import java.util.Scanner;

public class CrudTeste01 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        while(true) {
            producerMenu();
            op = Integer.parseInt(scanner.nextLine());
            if(op == 0) break;
            ProducerService.buildMenu(op);
        }
    }

    private static void producerMenu(){
        System.out.println(" ---- Producer Menu ----");
        System.out.println("Type the number of your operation:");
        System.out.println("  1. Serach for producer ");
        System.out.println("  0. Exit");
    }
}
