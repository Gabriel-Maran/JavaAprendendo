package aprendendoClassesUtilitarias.datas.teste;

import java.util.Date;

public class DateTeste01 {
    public static void main(String[] args) {
        Date data = new Date(1736617671071L); //long 100000
        data.setTime(data.getTime() + 3_600_000);
        System.out.println(data);
    }
}
