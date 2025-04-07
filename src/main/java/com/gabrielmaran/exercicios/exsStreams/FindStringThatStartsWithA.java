package com.gabrielmaran.exercicios.exsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringThatStartsWithA {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "apple", "banana", "cherry", "date", "elderberry");
        strings.stream()
                .filter(s-> s.toUpperCase().startsWith("A"))
                .findFirst().ifPresent(System.out::println);
    }
}
