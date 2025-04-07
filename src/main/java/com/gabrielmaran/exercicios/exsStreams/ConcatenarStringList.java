package com.gabrielmaran.exercicios.exsStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenarStringList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(
                List.of("Maçã", "Banana", "Laranja", "Uva", "Abacaxi", "Melancia", "Morango", "Kiwi", "Pera", "Manga"));
        String listaConcatenada = lista.stream().collect(Collectors.joining(" "));
        System.out.println(listaConcatenada);
    }
}
