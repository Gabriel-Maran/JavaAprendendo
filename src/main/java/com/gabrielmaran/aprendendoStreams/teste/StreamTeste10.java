package com.gabrielmaran.aprendendoStreams.teste;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTeste10 {
    public static void main(String[] args) {
//        Stream.iterate(1,num -> num + 2 )
//                .limit(10) //Quantidade
//                .forEach(System.out::println);
        Stream.iterate(new int[]{0,1}, n-> new int[]{n[1], n[0]+n[1]}) //Fibonacci
                .limit(10)
                .map(a -> a[1])
                .forEach(a -> System.out.println(a));
        System.out.println("----------------");
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 500))
                .limit(90)
                .forEach(System.out::println);
    }
}
