package aprendendoStreams.teste;

import java.util.List;

public class StreamTeste07 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
//        System.out.println(nums.stream().reduce(0, (x, y) -> x + y));
        System.out.println(nums.stream().reduce(0, Integer::sum));
        System.out.println("---");
        nums.stream().reduce((x, y) -> x * y).ifPresent(System.out::println);
        System.out.println("---");
        nums.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        nums.stream().reduce(Integer::max).ifPresent(System.out::println);
    }
}
