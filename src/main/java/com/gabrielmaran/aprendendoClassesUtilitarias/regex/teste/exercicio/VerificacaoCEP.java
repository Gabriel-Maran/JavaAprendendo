package com.gabrielmaran.aprendendoClassesUtilitarias.regex.teste.exercicio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificacaoCEP {
    public static void main(String[] args) {
        String regex = "^\\d{5}(-\\d{3})?$";
        String CEP = "12345678";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(CEP);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
