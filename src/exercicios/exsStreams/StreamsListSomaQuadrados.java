package exercicios.exsStreams;

import java.util.List;
import java.util.Optional;

public class StreamsListSomaQuadrados {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 5, 6, 7, 8, 9, 10);
        Optional<Integer> somaList = list.stream().map(num -> num * num).reduce(Integer::sum);
        System.out.println(somaList.get());
    }
}
