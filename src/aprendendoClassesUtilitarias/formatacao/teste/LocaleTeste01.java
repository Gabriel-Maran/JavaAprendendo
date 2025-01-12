package aprendendoClassesUtilitarias.formatacao.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste01 {
    public static void main(String[] args) {
        Locale localItaly = new Locale("it", "IT");
        Locale localCH= new Locale("it", "CH");
        Locale localPortugues = new Locale("pt", "PT");
        Locale localIndia = new Locale("hi", "IN");
        Calendar calendario = Calendar.getInstance();

        DateFormat dataPt = DateFormat.getDateInstance(DateFormat.FULL, localPortugues);
        DateFormat dataIt = DateFormat.getDateInstance(DateFormat.FULL, localItaly);
        DateFormat dataCh = DateFormat.getDateInstance(DateFormat.FULL, localCH);
        DateFormat dataIn = DateFormat.getDateInstance(DateFormat.FULL, localIndia);

        System.out.println("Portugal: "+dataPt.format(calendario.getTime()));
        System.out.println("Italia: "+dataIt.format(calendario.getTime()));
        System.out.println("Suiça: "+dataCh.format(calendario.getTime()));
        System.out.println("India: "+dataIn.format(calendario.getTime()));

        System.out.println(localItaly.getDisplayLanguage(localPortugues));
        System.out.println(localPortugues.getDisplayLanguage(localItaly));
        System.out.println(localItaly.getDisplayCountry(localPortugues));
        System.out.println(localPortugues.getDisplayCountry(localItaly));
    }
}
