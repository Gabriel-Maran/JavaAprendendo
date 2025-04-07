package com.gabrielmaran.aprendendoClassesUtilitarias.formatacao.teste;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTeste01 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat( "dd 'de' MMMM 'de' yyyy G 'as' HH:mm:ss z");
        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("13 de janeiro de 2025 d.C. as 21:06:52 BRT"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
