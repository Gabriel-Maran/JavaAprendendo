package com.gabrielmaran.aprendendoColecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTeste01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("J");
        mangas.add("A");
        mangas.add("Z");
        mangas.add("D");
        mangas.add("B");
        Collections.sort(mangas);
        for(String manga : mangas){
            System.out.println(manga);
        }

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(1.0);
        dinheiros.add(6.23);
        dinheiros.add(2.97);
        System.out.println("Antes: "+dinheiros);
        Collections.sort(dinheiros);
        System.out.println("Depois: "+dinheiros);
    }
}
