package com.gabrielmaran.exercicios.exsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingStringBySize {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        Map<Integer, List<String>> collect = strings.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }
}
