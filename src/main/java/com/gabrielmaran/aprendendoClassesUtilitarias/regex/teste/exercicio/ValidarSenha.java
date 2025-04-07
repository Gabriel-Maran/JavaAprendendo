package com.gabrielmaran.aprendendoClassesUtilitarias.regex.teste.exercicio;

import java.util.regex.Pattern;

public class ValidarSenha {
    public static void main(String[] args) {
        String[] senhas = {
                "Senha123!", // Válida
                "senha123",  // Inválida (sem maiúscula e especial)
                "SENHA123",  // Inválida (sem minúscula e especial)
                "Senha@123", // Válida
                "Senha1234567890123456@", // Inválida (mais de 20 caracteres)
        };
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&+=]).{8,20}$";

        for(String senha : senhas){
            if(Pattern.matches(regex, senha)){
                System.out.println("Senha valida: " + senha);
            }else{
                System.out.println("Senha invalida: " + senha);
            }
        }
    }
}
