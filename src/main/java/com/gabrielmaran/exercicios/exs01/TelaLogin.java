package com.gabrielmaran.exercicios.exs01;

import java.util.Scanner;

public class TelaLogin {
    public static void main(String[] args) {
        final String nome = "Gabriel";
        final String senha = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do Usuário");
        String tentativaNome = sc.nextLine();
        System.out.println("Digite a sua senha");
        String tentativaSenha = sc.nextLine();
        if(tentativaNome.equals(nome) && tentativaSenha.equals(senha)){
            System.out.println("Login realizado com sucesso");
        }else{
            System.out.println("Usuário ou senha incorreto(s)");
        }
    }
}
