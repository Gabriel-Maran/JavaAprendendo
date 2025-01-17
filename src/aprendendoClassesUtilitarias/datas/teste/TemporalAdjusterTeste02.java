package aprendendoClassesUtilitarias.datas.teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class TemporalAdjusterTeste02 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }

}

class ObterProximoDiaUtil implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayofWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayofWeek) {
            case THURSDAY:
                addDays = 4;
                break;
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
            default:
                addDays = 1;
                break;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}
