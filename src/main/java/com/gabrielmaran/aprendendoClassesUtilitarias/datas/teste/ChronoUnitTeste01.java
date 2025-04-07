package com.gabrielmaran.aprendendoClassesUtilitarias.datas.teste;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTeste01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2006, Month.AUGUST, 28, 8, 15,0);
        System.out.println(ChronoUnit.HOURS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(aniversario, LocalDateTime.now()));

    }
}
