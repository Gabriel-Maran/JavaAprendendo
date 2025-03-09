package aprendendoStreams.teste;

import aprendendoStreams.dominio.Categoria;
import aprendendoStreams.dominio.LightNovel;
import aprendendoStreams.dominio.Promocao;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTeste14 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Death Note", 4, Categoria.DRAMA),
            new LightNovel("Solo leveling", 5, Categoria.FANTASIA),
            new LightNovel("No Game No Life", 2.5, Categoria.DRAMA),
            new LightNovel("Naruto", 2, Categoria.FANTASIA),
            new LightNovel("Overlord", 3, Categoria.ROMANCE),
            new LightNovel("Fullmetal Alchemist", 3.1, Categoria.ROMANCE)));
    public static void main(String[] args) {
        Map<Categoria, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoria, Collectors.counting()));
        System.out.println(collect);
        Map<Categoria, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategoria, Collectors.maxBy(Comparator.comparing(LightNovel::getPreco))));
        System.out.println(collect1);

        Map<Categoria, LightNovel> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoria,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPreco)), Optional::get)));
        System.out.println(collect2);
       Map<Categoria, LightNovel> collect3 = lightNovels.stream().collect(
               Collectors.toMap(LightNovel::getCategoria, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPreco)))
       );
        System.out.println(collect3);
    }
}
