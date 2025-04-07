package com.gabrielmaran.aprendendoLambdas.teste;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTeste01 {
    public static void main(String[] args) {
        //funções anonimas
        //(parametro) -> (expressão)
        //(Car car) -> car.getColor().equals("green")
        List<String> nome = List.of("Gabriel", "Enzo", "Libero", "Maran");
        List<Integer> numeros = List.of(1,2,3,4,5,6);
        forEach(nome, (String s) -> System.out.println(s));
        forEach(numeros, i -> System.out.println(i));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer   ) {
        for(T e : list) {
            consumer.accept(e);
        }
    }
}
