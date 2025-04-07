    package com.gabrielmaran.aprendendoClassesUtilitarias.regex.teste;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

    public class PatternMatcherTeste05 {
        public static void main(String[] args) {
            // \d = Todos os digitos
            // \D = Tudo o que não for digito
            // \s = Espaços em branco \t \n \f \r
            // \S = Todos os caracteres excluindo os brancos
            // \w = Tudo que for de a-z ou A-Z, digitos, _
            // \W = Tudo que não for de a-z ou A-z, digitos, _
            // [] = procura o que está dentro dele(individual)
            // ? Zero ou uma ocorrencias
            // * Zero ou mais ocorrencias
            // + uma ou mais ocorrencias
            // {n,m} de n até m ocorrencias
            // () = agrupamento
            // | = ou. Ex: o(v/c)o vai dar match nas ocorrencias de ovo e oco
            // $ = fim da linha
            // . = Ele puxa tudo de está no intervalo dentro do primeiro e do ultimo. Ex: 1.3 = 123, 133, 1@3, 1A3

            String regex = "([A-Za-z0-9\\._-]+)@([a-zA-Z]+(\\.[a-z-A-Z]+)+)";
            String texto = "gabriel@gmail.com, joao@hotmail.com.br, @!@#ablaajkwd@mail.br, seila@mail";
            System.out.println("aaaaaaaaa@gmail.com.br é valido? "+"aaaaaaaaa@gmail.com.br".matches(regex));
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(texto);
            System.out.println(Arrays.toString(texto.split(",")));
            System.out.println(texto.split(",")[0].trim());
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
