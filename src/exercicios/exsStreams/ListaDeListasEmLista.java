package exercicios.exsStreams;

import java.util.List;
import java.util.stream.Collectors;

public class ListaDeListasEmLista {
    public static void main(String[] args) {
        List<List<String>> listaDeListas = List.of(
                List.of("maçã", "banana", "laranja"),
                List.of("cachorro", "gato", "pássaro"),
                List.of("azul", "verde", "vermelho")
        );

        List<String> list = listaDeListas.stream().flatMap(l -> l.stream()).toList();
        System.out.println(list);
    }
}
