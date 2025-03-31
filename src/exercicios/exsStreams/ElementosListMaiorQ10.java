package exercicios.exsStreams;

import java.util.List;

public class ElementosListMaiorQ10 {
    public static void main(String[] args) {
        List<Integer> list = List.of(11, 12, 13, 14, 15);
        boolean todosMaiores10 = list.stream().allMatch(num -> num > 10);
        System.out.println(todosMaiores10);
    }
}
