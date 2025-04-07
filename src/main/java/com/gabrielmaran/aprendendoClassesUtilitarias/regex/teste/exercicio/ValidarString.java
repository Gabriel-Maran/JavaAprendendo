package com.gabrielmaran.aprendendoClassesUtilitarias.regex.teste.exercicio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarString {
    public static void main(String[] args) {
        String regex = "(\\d)+";
        String passarValor = "A123";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passarValor);
        while(matcher.find()) {
            System.out.println("A String passada contem apenas números? "+matcher.group().equals(passarValor));
        }
    }
}
