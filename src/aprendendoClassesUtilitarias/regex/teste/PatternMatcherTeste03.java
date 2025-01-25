    package aprendendoClassesUtilitarias.regex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTeste03 {
    public static void main(String[] args) {
        // \d = Todos os digitos
        // \D = Tudo o que não for digito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = Tudo que for de a-z ou A-Z, digitos, _
        // \W = Tudo que não for de a-z ou A-z, digitos, _
        // [] = procura o que está dentro dele(individual)
//        String regex = "[a-zABC]";
        String regex = "0[xX][0-9A-Fa-f]";
        String texto = "12 0X 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while(matcher.find()) {
            System.out.print("Start: "+matcher.start()+", Grupo:"+matcher.group()+"\n");
        }
        int numeroHexa = 0x59F86A; // ou: 0X59F86A
        System.out.println(numeroHexa);
    }
}
