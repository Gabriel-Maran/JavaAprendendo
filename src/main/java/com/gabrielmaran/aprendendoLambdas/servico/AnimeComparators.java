package com.gabrielmaran.aprendendoLambdas.servico;

import com.gabrielmaran.aprendendoLambdas.dominio.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getNome().compareToIgnoreCase(a2.getNome());
    }
    public static int compareByEpisodes(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodios(), a2.getEpisodios());
    }
    public int compareByEpisodesNonStatic(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodios(), a2.getEpisodios());
    }
}
