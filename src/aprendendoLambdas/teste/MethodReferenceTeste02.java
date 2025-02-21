package aprendendoLambdas.teste;

import aprendendoLambdas.dominio.Anime;
import aprendendoLambdas.servico.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTeste02 {
    //Reference para um metodo nao estatico, usando objeto
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> list = new ArrayList<>();
        list.add(new Anime("Berserk", 43));
        list.add(new Anime("One Piece", 1000));
        list.add(new Anime("Naruto", 500));
        list.sort(animeComparators::compareByEpisodesNonStatic);
//        list.sort((a,b)-> animeComparators.compareByEpisodesNonStatic(a,b));
        System.out.println(list);
    }
}
