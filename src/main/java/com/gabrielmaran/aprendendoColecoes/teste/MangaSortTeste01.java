package com.gabrielmaran.aprendendoColecoes.teste;

import com.gabrielmaran.aprendendoColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByNomeComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class MangaSortTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(222L, "J", 156.8));
        mangas.add(new Manga(444L, "A", 112.3));
        mangas.add(new Manga(333L, "Z", 152.1));
        mangas.add(new Manga(111L, "C", 123.5));
        mangas.add(new Manga(555L, "D", 102.6));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("---------------------------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByNomeComparator());
        System.out.println("---------------------------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
