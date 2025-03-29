package exercicios.exsStreams;

import java.util.List;
import java.util.Optional;

public class StreamsListMaiorNum {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 5, 6, 7, 8, 9, 10);
        Optional<Integer> maiorNumList = list.stream().reduce(Integer::max);
        System.out.println(maiorNumList.get());
    }
}
