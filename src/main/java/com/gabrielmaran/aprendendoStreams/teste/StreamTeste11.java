package com.gabrielmaran.aprendendoStreams.teste;

import com.gabrielmaran.aprendendoStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste11 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Death Note", 4),
            new LightNovel("Solo leveling", 5),
            new LightNovel("No Game No Life", 2.5), new LightNovel("Naruto", 2),
            new LightNovel("Overlord", 3),
            new LightNovel("Fullmetal Alchemist", 3.1)));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        lightNovels.stream().max(Comparator.comparing(LightNovel::getPreco)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPreco))).ifPresent(System.out::println);

        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPreco).sum());
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPreco)));

        lightNovels.stream().mapToDouble(LightNovel::getPreco).average().ifPresent(System.out::println);
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPreco)));

        DoubleSummaryStatistics estatisticaPrecoLN = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPreco));
        System.out.println(estatisticaPrecoLN);

        String estatisticaNomesLN = lightNovels.stream().map(LightNovel::getNome).collect(Collectors.joining(", "));
        System.out.println(estatisticaNomesLN);
    }
}
