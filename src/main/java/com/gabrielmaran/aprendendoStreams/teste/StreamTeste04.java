package com.gabrielmaran.aprendendoStreams.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamTeste04 {
    public static void main(String[] args) {
        //FlatMap é usado pappra estes casos
        List<List<String>> listaGeral = new ArrayList<>();
        List<String> listaPessoas = List.of("Gabriel", "Joao", "Bruno", "Carlos");
        List<String> listaAnimais = List.of("Urso", "Leao", "Aguia", "Macaco");
        List<String> listaJogos  = List.of("Xadrez", "Domino", "Truco", "Quebra-Cabeça");
        listaGeral.add(listaPessoas);
        listaGeral.add(listaAnimais);
        listaGeral.add(listaJogos);
        for(List<String> listSeparada: listaGeral) {
            System.out.println("-----------------------");
            for(String elemento: listSeparada) {
                System.out.println(elemento);
            }
        }
        System.out.println("------------------");
        listaGeral.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
