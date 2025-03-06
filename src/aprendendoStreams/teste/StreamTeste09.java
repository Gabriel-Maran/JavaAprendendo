package aprendendoStreams.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTeste09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(n -> n%2 == 0).forEach(n -> System.out.print(n+", "));//Inicia no 1 e termina no 50
        System.out.println();
        IntStream.range(1, 50).filter(n -> n%2 == 0).forEach(n -> System.out.print(n+", "));//Inicia no 2 e termina no 49
        System.out.println();
        Stream.of("Eu ", "não ", "sei ", "o ", "que ", "eu ", "estou ", "escrevendo ")
                .map(String::toUpperCase)
                .forEach(System.out::print);
        System.out.println();
        Integer[] nums = {1,2,4,5,6,321,23,987,8746,1234};
        Arrays.stream(nums)
                .min(Integer::compare)
                .ifPresent(System.out::println);

        Arrays.stream(nums)
                .max(Integer::compareTo) //.max((num1, num2) -> num1.compareTo(num2))
                .ifPresent(System.out::println);
        System.out.println("\n \n");
        try(Stream<String> lines = Files.lines(Paths.get("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoStreams\\file.txt"))){
            lines.filter(l -> l.contains("Java"))
                    .forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
