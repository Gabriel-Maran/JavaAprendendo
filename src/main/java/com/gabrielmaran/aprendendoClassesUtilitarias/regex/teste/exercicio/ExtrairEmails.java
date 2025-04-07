package com.gabrielmaran.aprendendoClassesUtilitarias.regex.teste.exercicio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtrairEmails {
    public static void main(String[] args) {
        String regex = "\\b([\\w-]+)@([\\w-]+)([\\.A-Za-z]+)\\b";
        String passarValor ="Meus e-mails são teste@gmail.com e outro_email@dominio.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passarValor);
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
