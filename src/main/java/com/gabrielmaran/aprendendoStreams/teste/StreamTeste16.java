package com.gabrielmaran.aprendendoStreams.teste;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTeste16 {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000L;
        sumFor(num);
        sumStream(num);
        sumParallelStreamIterate(num);
        sumParallelLongStreamIterate(num);
    }
    public static void sumFor(long num){
        System.out.println("Sum for 0");
        long resultado = 0;
        long valorInicial = System.currentTimeMillis();
        for (long i = 1; i<=num; i++){
            resultado = resultado + i;
        }
        long valorFinal = System.currentTimeMillis();
        System.out.println(resultado+ " "+ (valorFinal - valorInicial)+ "ms");
    }
    public static void sumStream(long num){
        System.out.println("Sum StreamIterate");
        long valorInicial = System.currentTimeMillis();
        long resultado =  Stream.iterate(1L, i-> i+1).limit(num).reduce(0L,Long::sum);
        long valorFinal = System.currentTimeMillis();
        System.out.println(resultado+ " "+ (valorFinal - valorInicial)+ "ms");
    }
    public static void sumParallelStreamIterate(long num) {
        System.out.println("Sum sumParallelStreamIterate");
        long valorInicial = System.currentTimeMillis();
        long resultado = Stream.iterate(1L, i->i+1).limit(num).parallel().reduce(0L, Long::sum);
        long valorFinal = System.currentTimeMillis();
        System.out.println(resultado + " " + (valorFinal - valorInicial) + "ms");
    }
    public static void sumParallelLongStreamIterate(long num){
        System.out.println("Sum sumParallelLongStreamIterate");
        long valorInicial = System.currentTimeMillis();
        long resultado =  LongStream.rangeClosed(1L, num).reduce(0L,Long::sum);
        long valorFinal = System.currentTimeMillis();
        System.out.println(resultado+ " "+ (valorFinal - valorInicial)+ "ms");
    }
    //Limit, find first -> Não foram feitos para usar com parallels
    //Find Any -> É bom com parallels
    //Se o processamento for muito alto, você se beneficia usando multiplas Threads(parallel)
    //Se a quantidade de dados for muito pequeno, não vale a pena usar parallel
    //Tipos de coleções -> Algumas são boas(ArrayList) outras são ruins(LinkedList) para usar com parallels
    //Streans com tamanhos definidos são bons parar trabalar com parallels
}
