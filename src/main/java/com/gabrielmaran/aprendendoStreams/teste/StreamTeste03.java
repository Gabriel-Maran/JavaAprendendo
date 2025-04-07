package com.gabrielmaran.aprendendoStreams.teste;

import com.gabrielmaran.aprendendoStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTeste03 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Death Note", 10),
            new LightNovel("Solo leveling", 5),
            new LightNovel("No Game No Life", 2.5),
            new LightNovel("Naruto", 2),
            new LightNovel("Overlord", 3),
            new LightNovel("Fullmetal Alchemist", 3.1)));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
//        long count = stream.filter(ln -> ln.getPreco() < 4).count();//Pegando os dados e contando

        long count2 = lightNovels.stream()//Chamando novamente o stream, pois ele foi fechado no primeiro count
                .distinct().filter(ln -> ln.getPreco() < 4).count();//Pegando os dados e contando
                //distinct retorna os metodos sem a repetição delimitada ppelo hashCode e equals, da classe do objeto
        System.out.println(count2);
    }
}
