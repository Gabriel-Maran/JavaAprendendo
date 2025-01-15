package aprendendoClassesUtilitarias.datas.teste;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DurationTeste01 { //Para utilizar o "Duration" a outra classe deve suportar segundos, caso contrario, retornara erro
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfter10Years = now.plusYears(10).plusMinutes(25).plusSeconds(38).plusNanos(123456);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeNowMinus10Hours = LocalTime.now().minusHours(10).plusMinutes(100);
        Duration diferencaLocalsDateTime = Duration.between(now, nowAfter10Years);
        Duration diferencaLocalsTime = Duration.between(timeNow, timeNowMinus10Hours);
        Duration diferencaLocalsTime2 = Duration.between(Instant.now(), Instant.now().plusSeconds(10000));
        Duration d4 = Duration.ofDays(213);
        Duration d5 = Duration.ofMinutes(213);
        Duration d6 = Duration.of(213, ChronoUnit.HOURS);
        System.out.println(diferencaLocalsDateTime);
        System.out.println(diferencaLocalsTime);
        System.out.println(diferencaLocalsTime2);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
    }
}
