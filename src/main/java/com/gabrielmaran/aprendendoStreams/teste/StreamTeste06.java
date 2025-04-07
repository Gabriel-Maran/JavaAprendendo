package com.gabrielmaran.aprendendoStreams.teste;

import com.gabrielmaran.aprendendoStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTeste06 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Death Note", 4),
            new LightNovel("Solo leveling", 5),
            new LightNovel("No Game No Life", 2.5), new LightNovel("Naruto", 2),
            new LightNovel("Overlord", 3),
            new LightNovel("Fullmetal Alchemist", 3.1)));

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPreco() > 15)); //Procura para ver se algum obejeto da lista bate com a caracteristiica
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPreco() > 0)); //Procura para ver se todos os objetos da lista batem com a caracteristica
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPreco() < 15)); //Procura para ver se nenhum objeto bate com a caracteristica
        lightNovels.stream()
                .filter(ln -> ln.getPreco() > 3)
                .findAny().ifPresent(System.out::println);
        lightNovels.stream()
                .filter(ln -> ln.getPreco() > 3)
                .sorted(Comparator.comparing(LightNovel::getPreco).reversed())
                .findFirst().ifPresent(System.out::println);
        lightNovels.stream()
                .filter(ln -> ln.getPreco() > 3)
                .max(Comparator.comparing(LightNovel::getPreco)).ifPresent(System.out::println); //O max traz o primeiro, apos organizar a lista
    }
}
