package aprendendoClassesUtilitarias.datas.teste;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTeste01 {
    public static void main(String[] args) {
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
    }
}
