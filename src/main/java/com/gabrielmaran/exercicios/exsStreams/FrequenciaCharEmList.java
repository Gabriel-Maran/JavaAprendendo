package com.gabrielmaran.exercicios.exsStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequenciaCharEmList {
    public static void main(String[] args) {
        String s = "banana";
        Map<Character, Long> frequencia = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                ));
        System.out.println(frequencia);
    }
}
