package com.gabrielmaran.exercicios.exsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordOccurrence {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "banana", "banana", "banana", "cherry", "date", "elderberry");
        Map<String, Integer> collect = strings.stream()
                                    .collect(Collectors.toMap(Function.identity(), palavra -> 1, (existente, novo) -> existente + 1));
        collect.values().forEach(System.out::println);
    }
}
