package aprendendoLambdas.teste;

import aprendendoLambdas.dominio.Anime;
import aprendendoLambdas.servico.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTeste04 {
    //Reference para um construtor
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeCompparators = AnimeComparators::new;
//        Supplier<AnimeComparators> newAnimeCompparators = () ->  new AnimeComparators();
        List<Anime> list = new ArrayList<>();
        list.add(new Anime("Berserk", 43));
        list.add(new Anime("One Piece", 1000));
        list.add(new Anime("Naruto", 500));
        list.sort(AnimeComparators::compareByEpisodes);
        System.out.println(list);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;//        BiFunction<String, Integer, Anime> animeBiFunction = (name, episode) -> new Anime(name, episode)
        System.out.println(animeBiFunction.apply("Demon Slayer", 40));
    }
}
