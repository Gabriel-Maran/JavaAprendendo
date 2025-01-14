package aprendendoClassesUtilitarias.datas.teste;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTeste01 {
    public static void main(String[] args) {
        //Recomendado usar LocalDate


//        System.out.println(new Date());
//        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        LocalDate date = LocalDate.of(2022, Month.JANUARY, 20);
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfMonth());
        System.out.println(date); // O output disso é como geralmente é salvo no Banco de Dados, facilitando o envio e a comunicação entre as partes
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
