package exercicios.exsStreams;

import java.util.List;

public class StreamsListUpperCase {
    public static void main(String[] args) {
        List<String> list = List.of("awidk", "seila123", "123seilawmawidimaw", "eita");
        List<String> listUpper = list.stream().map(String::toUpperCase).toList();
        System.out.println(listUpper);
    }
}
