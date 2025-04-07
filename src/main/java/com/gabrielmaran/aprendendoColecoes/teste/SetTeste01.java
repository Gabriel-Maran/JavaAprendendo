package com.gabrielmaran.aprendendoColecoes.teste;

import com.gabrielmaran.aprendendoColecoes.dominio.Manga;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTeste01 {
    public static void main(String[] args) {
//        Set<Manga> mangas = new HashSet<>(); // Não permite objetos duplicados, não indexado
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(2L, "J", 156.8, 0));
        mangas.add(new Manga(2L, "J", 156.8, 0));
        mangas.add(new Manga(4L, "A", 112.3, 5));
        mangas.add(new Manga(3L, "Z", 152.1, 0));
        mangas.add(new Manga(1L, "C", 123.5, 2));
        mangas.add(new Manga(5L, "D", 102.6,0));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
