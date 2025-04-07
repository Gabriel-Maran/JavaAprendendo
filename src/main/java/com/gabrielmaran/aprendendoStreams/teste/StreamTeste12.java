package com.gabrielmaran.aprendendoStreams.teste;

import com.gabrielmaran.aprendendoStreams.dominio.Categoria;
import com.gabrielmaran.aprendendoStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTeste12 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Death Note", 4, Categoria.DRAMA),
            new LightNovel("Solo leveling", 5, Categoria.FANTASIA),
            new LightNovel("No Game No Life", 2.5, Categoria.DRAMA),
            new LightNovel("Naruto", 2, Categoria.FANTASIA),
            new LightNovel("Overlord", 3, Categoria.ROMANCE),
            new LightNovel("Fullmetal Alchemist", 3.1, Categoria.ROMANCE)));
    public static void main(String[] args) {
        Map<Categoria, List<LightNovel>> categoriaLNMap = new HashMap<>();
        List<LightNovel> fantasia = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();
        for(LightNovel novel : lightNovels) {
            switch (novel.getCategoria()){
                case DRAMA: drama.add(novel); break;
                case FANTASIA: fantasia.add(novel); break;
                case ROMANCE: romance.add(novel); break;
            }
        }
        categoriaLNMap.put(Categoria.DRAMA, drama);
        categoriaLNMap.put(Categoria.FANTASIA, fantasia);
        categoriaLNMap.put(Categoria.ROMANCE, romance);
        System.out.println(categoriaLNMap);

        Map<Categoria, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoria));
        System.out.println(collect);
    }
}
