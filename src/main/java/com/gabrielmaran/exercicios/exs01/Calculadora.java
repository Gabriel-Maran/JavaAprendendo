package com.gabrielmaran.exercicios.exs01;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = sc.nextInt();
        int escolha;
        do {
            System.out.println("Digte 1 para soma, 2 para subtração, 3 para multiplicação, 4 para divisão");
            escolha = sc.nextInt();
        } while (escolha < 1 || escolha > 4);
        switch (escolha) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                if(n2 == 0){
                    System.out.println("Divisão por 0 não é permitido!");
                    break;
                }
                System.out.println(n1 / n2);
                break;
        }
        sc.close();
    }
}
