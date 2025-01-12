package aprendendoClassesUtilitarias.datas.teste;

import java.util.Calendar;
import java.util.Date;

public class CalendarTeste01 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        Date data = calendario.getTime();
        System.out.println(calendario);
        System.out.println(data);
        if(calendario.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }
        calendario.add(Calendar.DAY_OF_MONTH, 2);
        calendario.add(Calendar.HOUR, 12);
        data = calendario.getTime();
        System.out.println(data.toString());
        calendario.roll(Calendar.HOUR_OF_DAY, 23); //rool manteve o dia e so mudou o horario, teoricamente, voltou uma hora
        data = calendario.getTime();
        System.out.println(data.toString());

    }
}
