package aprendendoStreams.teste;

import aprendendoStreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class StreamTeste08 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Death Note", 4),
            new LightNovel("Solo leveling", 5),
            new LightNovel("No Game No Life", 2.5), new LightNovel("Naruto", 2),
            new LightNovel("Overlord", 3),
            new LightNovel("Fullmetal Alchemist", 3.1)));

    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovel::getPreco)
                .filter(preco -> preco >3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPreco)
                .filter(preco -> preco > 3)
                .sum();
        System.out.println(sum);

    }
}
