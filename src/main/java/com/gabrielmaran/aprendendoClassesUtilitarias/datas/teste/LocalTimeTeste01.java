package com.gabrielmaran.aprendendoClassesUtilitarias.datas.teste;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste01 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23,30,4);
        LocalTime localTimeNow = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTimeNow);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
