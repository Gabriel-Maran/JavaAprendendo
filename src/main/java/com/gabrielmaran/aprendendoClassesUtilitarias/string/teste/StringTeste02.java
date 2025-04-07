package com.gabrielmaran.aprendendoClassesUtilitarias.string.teste;

public class StringTeste02 {
    public static void main(String[] args) {
        String nome = "  Gabriel  ";
        String numeros = "0123456789";
        System.out.println(nome.charAt(0));//Restorna o caracter na possição chamada, começando sempre em "0"
        System.out.println(nome.length());
        System.out.println(nome.replace("i","e"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0));
        System.out.println(numeros.substring(0, numeros.length()));
        System.out.println(nome.trim());//Remove os espaços em branco do começo e do fim da String

    }
}
