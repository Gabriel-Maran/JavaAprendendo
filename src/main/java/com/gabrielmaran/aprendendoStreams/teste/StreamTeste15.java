package com.gabrielmaran.aprendendoStreams.teste;

import com.gabrielmaran.aprendendoStreams.dominio.Categoria;
import com.gabrielmaran.aprendendoStreams.dominio.LightNovel;
import com.gabrielmaran.aprendendoStreams.dominio.Promocao;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTeste15 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Death Note", 4, Categoria.DRAMA),
            new LightNovel("Solo leveling", 5, Categoria.FANTASIA),
            new LightNovel("No Game No Life", 2.5, Categoria.DRAMA),
            new LightNovel("Naruto", 2, Categoria.FANTASIA),
            new LightNovel("Overlord", 3, Categoria.ROMANCE),
            new LightNovel("Fullmetal Alchemist", 3.1, Categoria.ROMANCE)));
    public static void main(String[] args) {
        Map<Categoria, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategoria, Collectors.summarizingDouble(LightNovel::getPreco)));
        System.out.println(collect);
        Map<Categoria, List<Promocao>> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategoria, Collectors.mapping(ln -> {
                    return ln.getPreco() < 3 ? Promocao.SOBRE_PROMOCAO : Promocao.PRECO_NORMAL;
                }, Collectors.toList())));
        System.out.println(collect1);
        Map<Categoria, Set<Promocao>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategoria, Collectors.mapping(ln -> {
                    return ln.getPreco() < 3 ? Promocao.SOBRE_PROMOCAO : Promocao.PRECO_NORMAL;
                }, Collectors.toSet())));
        System.out.println(collect2);
        Map<Categoria, LinkedHashSet<Promocao>> collect3 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategoria, Collectors.mapping(ln -> {
                    return ln.getPreco() < 3 ? Promocao.SOBRE_PROMOCAO : Promocao.PRECO_NORMAL;
                }, Collectors.toCollection(LinkedHashSet::new)))); //Mantem a ordem de inserção
        System.out.println(collect3);
    }
}
