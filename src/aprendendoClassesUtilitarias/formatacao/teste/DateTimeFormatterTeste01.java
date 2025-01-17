package aprendendoClassesUtilitarias.formatacao.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTeste01 {
    public static void main(String[] args) {
        LocalDateTime dataBase = LocalDateTime.now();
        String data1 = dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String data2 = dataBase.format(DateTimeFormatter.ISO_DATE);
        String data3 = dataBase.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
        LocalDate dataBase2 = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataBase3 = LocalDate.parse(data2, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime dataBase4 = LocalDateTime.parse(data3);
        LocalDateTime dataBase5 = LocalDateTime.parse("2025-10-19T05:30", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(dataBase2);
        System.out.println(dataBase3);
        System.out.println(dataBase4);
        System.out.println(dataBase5);

        LocalDateTime now = LocalDateTime.now();
        String formattedString = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(formattedString);
        LocalDateTime parsedString = LocalDateTime.parse("2025-01-17T13:14:00.9614529");
        System.out.println(parsedString);

        DateTimeFormatter formatterBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterEUA = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter formatterJapao = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(LocalDate.now().format(formatterBrasil));
        System.out.println(LocalDate.now().format(formatterEUA));
        System.out.println(LocalDate.now().format(formatterJapao));

        LocalDate parseBR = LocalDate.parse("01/02/2025", formatterBrasil);
        System.out.println(parseBR);

        DateTimeFormatter dataTFAlemanha = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        System.out.println(LocalDate.now().format(dataTFAlemanha));

        LocalDate parseDataAlemanha = LocalDate.parse("17.Januar.2025", dataTFAlemanha);
        System.out.println(parseDataAlemanha);
    }
}
