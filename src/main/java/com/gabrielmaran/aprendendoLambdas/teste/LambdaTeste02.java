package com.gabrielmaran.aprendendoLambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTeste02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Abc", "defg", "hi");
        List<Integer> integers = map(strings, s -> s.length());
        List<String> stringsUppper = map(strings, s -> s.toUpperCase());
        List<String> stringsLower = map(strings, s -> s.toLowerCase());

        System.out.println(integers);
        System.out.println("---------------");
        System.out.println(stringsUppper);
        System.out.println("---------------");
        System.out.println(stringsLower);
        System.out.println("---------------");
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            result.add(function.apply(e));
//            R r = function.apply(e);
//            result.add(r);
        }
        return result;
    }
}
