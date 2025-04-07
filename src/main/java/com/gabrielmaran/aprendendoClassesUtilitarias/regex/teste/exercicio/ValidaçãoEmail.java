package com.gabrielmaran.aprendendoClassesUtilitarias.regex.teste.exercicio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaçãoEmail {
    public static void main(String[] args) {
        String regex = "([\\dA-Za-z]+)([\\w]+)@([A-Za-z]+)([\\.A-Za-z]+)";
        String email = "gabriel@gmail.com.br";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
