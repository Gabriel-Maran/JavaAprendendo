package com.gabrielmaran.aprendendoClassesUtilitarias.datas.teste;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class PeriodTeste01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate now = LocalDate.now();
        LocalDate nowAfter25Years = now.plusYears(25).plusMonths(35).plusDays(589);
        Period period1 = Period.between(now, nowAfter25Years);
        Period period2 = Period.ofDays(10);
        Period period3 = Period.ofWeeks(49);
        Period period4 = Period.ofMonths(49);
        Period period5 = Period.ofYears(3);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
        System.out.println(now.until(now.plusDays(period3.getDays()), ChronoUnit.MONTHS));


        System.out.println("Digite a quantidade de semanas que o bebê tem, para saber seu valor em dias, meses e anos");
        Period semanasBebe = Period.ofWeeks(sc.nextInt());
        System.out.println("Dias: "+semanasBebe.getDays());
        System.out.println("Meses: "+now.until(now.plusDays(semanasBebe.getDays()), ChronoUnit.MONTHS));
        System.out.println("Anos: "+now.until(now.plusDays(semanasBebe.getDays()), ChronoUnit.YEARS));
    }
}
