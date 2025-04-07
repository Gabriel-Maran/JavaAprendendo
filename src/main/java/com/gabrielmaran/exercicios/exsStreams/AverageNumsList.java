package com.gabrielmaran.exercicios.exsStreams;

import java.util.ArrayList;
import java.util.List;

public class AverageNumsList {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(
                12, 25, 61, 53, 23, 76, 12, 56, 23, 43
        ));
        numeros.stream().mapToInt(n->n).average().ifPresent(System.out::println);
    }
}
