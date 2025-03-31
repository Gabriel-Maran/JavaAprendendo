package exercicios.exsStreams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SepararListParImpar {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 5, 6, 7, 8, 9, 10);
        List<List<Integer>> list1 = list.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0))
                .values().stream().toList();
        System.out.println(list1);

    }
}
