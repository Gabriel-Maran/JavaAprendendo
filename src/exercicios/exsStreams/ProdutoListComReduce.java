package exercicios.exsStreams;

import java.util.List;

public class ProdutoListComReduce {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(5, 3, 8, 2, 10);
        Integer produtoList = numeros.stream().reduce(1, (a, b) -> a * b);
        System.out.println(produtoList);
    }
}
