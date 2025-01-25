package aprendendoClassesUtilitarias.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste02 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = Tudo que for de a-z ou A-Z, digitos, _
        // \W = Tudo que não for de a-z ou A-z, digitos, _
        String regex = "\\W";
        String texto = "aba213 5 a_w$A@\n#";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while(matcher.find()) {
            System.out.print("Start: "+matcher.start()+", Grupo:"+matcher.group()+"\n");
        }
    }
}
