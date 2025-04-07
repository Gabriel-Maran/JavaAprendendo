package com.gabrielmaran.exercicios.exsStreams;

import java.util.ArrayList;
import java.util.List;

public class NumsToQuadradosList {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(
                12, 25, 61, 53, 23, 765, 12, 56, 23, 43
        ));
        List<Integer> listSquared = numeros.stream().map(n -> n * n).toList();
        listSquared.forEach(n -> System.out.println(n));
    }
}
