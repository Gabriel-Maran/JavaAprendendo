package aprendendoClassesUtilitarias.datas.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTeste01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2025, 1, 5);
        LocalTime localTime = LocalTime.of(23, 15, 5);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println(localDateTimeNow);
        System.out.println(localDateTimeNow.getHour());
        System.out.println(localDateTime);
        LocalDateTime ldt1 = localDate.atTime(12,15,19);
        LocalDateTime ldt2 = localTime.atDate(localDate);
        System.out.println(ldt1);
    }
}
