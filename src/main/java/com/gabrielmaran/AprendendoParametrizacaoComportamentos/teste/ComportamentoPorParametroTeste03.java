package com.gabrielmaran.AprendendoParametrizacaoComportamentos.teste;

import com.gabrielmaran.AprendendoParametrizacaoComportamentos.dominio.Carro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTeste03 {
    public static List<Carro> listaCarros = List.of(new Carro("green", 2011), new Carro("red", 1998), new Carro("yellow", 2000));

    public static void main(String[] args) {
        System.out.println(filter(listaCarros, carro -> carro.getColor().equals("green")));
        System.out.println(filter(listaCarros, carro -> carro.getYear() < (2000)));
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filtered.add(e);
            }
        }
        return filtered;
    }
}
