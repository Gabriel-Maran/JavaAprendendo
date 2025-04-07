package com.gabrielmaran.aprendendoClassesUtilitarias.datas.teste;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTeste01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId zoneTokyo = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneTokyo);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTimeTokyo = now.atZone(zoneTokyo);
        System.out.println(zonedDateTimeTokyo);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        System.out.println(nowInstant.atZone(zoneTokyo));

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset zofManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(zofManaus);
        System.out.println(offsetDateTime1);
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, zofManaus);
        System.out.println(offsetDateTime2);

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(zofManaus);
        System.out.println(offsetDateTime3);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate dataAntiga = LocalDate.of(1900,2,1);
        System.out.println(JapaneseDate.from(dataAntiga));
    }
}
