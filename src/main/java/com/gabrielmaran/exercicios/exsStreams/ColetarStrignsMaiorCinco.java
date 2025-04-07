package com.gabrielmaran.exercicios.exsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ColetarStrignsMaiorCinco {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        Set<String> stringsGrandes = strings.stream().filter(s -> s.length() > 5).collect(Collectors.toSet());
        System.out.println(stringsGrandes);
    }
}
