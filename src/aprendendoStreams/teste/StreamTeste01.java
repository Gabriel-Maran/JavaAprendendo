package aprendendoStreams.teste;

import aprendendoStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class StreamTeste01 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Death Note", 10),
            new LightNovel("Solo leveling", 5),
            new LightNovel("No Game No Life", 2.5), new LightNovel("Naruto", 2),
            new LightNovel("Overlord", 3),
            new LightNovel("Fullmetal Alchemist", 3.1)));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getNome));
        List<String> nomes = new ArrayList<>();
        System.out.println(lightNovels);
        for(LightNovel novel : lightNovels) {
            if(novel.getPreco() < 3.0 && nomes.size() < 3) {
                nomes.add(novel.getNome());
            }
        }
        System.out.println(nomes);
    }

}
