package com.gabrielmaran.aprendendoClassesUtilitarias.regex.teste.exercicio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapturaFormatoDataAniver {
    public static void main(String[] args) {
        String regex = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/\\d{1,4}$";
        String data = "1/2/2";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
