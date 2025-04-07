package com.gabrielmaran.exercicios.exsStreams;

import java.util.Arrays;
import java.util.List;

public class RemoveEqualElements {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "cherry", "cherry", "date", "elderberry");
        List<String> listString = strings.stream().distinct().toList();
        System.out.println(listString);
    }
}
