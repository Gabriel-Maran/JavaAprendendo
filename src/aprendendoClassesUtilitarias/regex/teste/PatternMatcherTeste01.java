package aprendendoClassesUtilitarias.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste01 {
    public static void main(String[] args) {
        String regex = "aba";
        String texto = "abababa";
        boolean encontrou = false;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while(matcher.find()) {
            System.out.print(matcher.start()+" ");
        }
    }
}
