package com.gabrielmaran.aprendendoObjetos.associacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite pergunta e eu responderei com sim ou não");
        String pergunta = scan.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.printf("Sim");
        }else{
            System.out.println("Não");
        }
    }
}
