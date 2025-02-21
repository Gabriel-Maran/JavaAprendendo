package aprendendoLambdas.teste;

import aprendendoLambdas.dominio.Anime;
import aprendendoLambdas.servico.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTeste01 {
    //Reference para um metodo estatico, usando classe
    public static void main(String[] args) {
        List<Anime> list = new ArrayList<>();
        list.add(new Anime("Berserk", 43));
        list.add(new Anime("One Piece", 1000));
        list.add(new Anime("Naruto", 500));
        Collections.sort(list, AnimeComparators::compareByTitle); //Collections.sort(list, (a1,a2) -> AnimeComparators.compareByTitle(a1,a2));
//        list.sort(AnimeComparators::compareByTitle);
        System.out.println(list);
        list.sort(AnimeComparators::compareByEpisodes);
        System.out.println(list);
    }
}
