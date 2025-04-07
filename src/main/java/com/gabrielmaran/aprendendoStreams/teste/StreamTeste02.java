package com.gabrielmaran.aprendendoStreams.teste;

import com.gabrielmaran.aprendendoStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste02 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Death Note", 10),
            new LightNovel("Solo leveling", 5),
            new LightNovel("No Game No Life", 2.5), new LightNovel("Naruto", 2),
            new LightNovel("Overlord", 3),
            new LightNovel("Fullmetal Alchemist", 3.1)));

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getNome))//Ordena
                .filter(novel -> novel.getPreco() <= 4).limit(3)//filtra por preço <= 4 e coloca um limite dde 3
                .map(ln -> ln.getNome())//Busca os nomes dessas Light Novels
                .collect(Collectors.toList());//Coleta os daos finais e tranforma no que for passado para transformar, no caso, uma lista

        System.out.println(titles);
    }
}
