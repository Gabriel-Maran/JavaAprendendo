package com.gabrielmaran.aprendendoObjetos.blocosinicializacao.teste;

import com.gabrielmaran.aprendendoObjetos.blocosinicializacao.dominio.Anime;

public class TesteAnime01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Anime1");
        Anime anime2 = new Anime();
        for (int episodio : anime1.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
