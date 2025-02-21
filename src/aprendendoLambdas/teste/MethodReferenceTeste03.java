package aprendendoLambdas.teste;

import aprendendoLambdas.dominio.Anime;
import aprendendoLambdas.servico.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceTeste03 {
    //Reference para um metodo nao estatico, usando classe
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<String> list = new ArrayList<>(List.of("Gabriel", "Joao", "Henrique", "Bruno"));
        list.sort(String::compareTo);
        System.out.println(list);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("10");
        System.out.println(num);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list,"Gabriel"));
    }
}
