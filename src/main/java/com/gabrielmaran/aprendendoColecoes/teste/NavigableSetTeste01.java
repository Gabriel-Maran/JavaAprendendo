package com.gabrielmaran.aprendendoColecoes.teste;

import com.gabrielmaran.aprendendoColecoes.dominio.Manga;
import com.gabrielmaran.aprendendoColecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmarphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());//"Dobule.compare" por que os dois são variaveis primitivas(o1.getPreco e o2.getPreco)
    }
}

public class NavigableSetTeste01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> smartphones = new TreeSet<>(new SmarphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "A");
        smartphones.add(smartphone);
//        System.out.println(smartphones);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator()); // TreeSet faz a organização do ArrayList, baseando-se no Comparator ou na classe CompareTo, da implementação Comparable em Manga
        // Vai se basear no CompareTo da classe
        mangas.add(new Manga(2L, "J", 156.8, 0));
        mangas.add(new Manga(4L, "A", 112.0, 5));
        mangas.add(new Manga(3L, "Z", 152.1, 0));
        mangas.add(new Manga(1L, "C", 123.5, 2));
        mangas.add(new Manga(5L, "D", 102.6, 0));
//        for(Manga manga : mangas.descendingSet()) {
//            System.out.println(manga);
//        }
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("------------------------------------------------");
        Manga seiLa = new Manga(4L, "A", 112.0, 5);
        System.out.println(mangas.lower(seiLa));
        System.out.println(mangas.floor(seiLa));
        System.out.println(mangas.higher(seiLa));
        System.out.println(mangas.ceiling(seiLa));

        System.out.println("------------------------------------------------");
        System.out.println("Tamanho: " + mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println("Tamanho: " + mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println("Tamanho: " + mangas.size());

        // lower <
        // floor <=
        // higher >
        // ceiling =>
    }
}
