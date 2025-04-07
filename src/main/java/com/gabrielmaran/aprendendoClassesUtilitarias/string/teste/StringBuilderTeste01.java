package com.gabrielmaran.aprendendoClassesUtilitarias.string.teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Gabriel";
        nome.concat(" Maran");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder(16);
        sb.append(nome);
        sb.append(" 1").append(" 2");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb.toString());
    }
}
