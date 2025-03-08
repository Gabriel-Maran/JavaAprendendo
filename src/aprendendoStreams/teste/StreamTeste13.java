package aprendendoStreams.teste;

import aprendendoStreams.dominio.Categoria;
import aprendendoStreams.dominio.LightNovel;
import aprendendoStreams.dominio.Promocao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTeste13 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Death Note", 4, Categoria.DRAMA),
            new LightNovel("Solo leveling", 5, Categoria.FANTASIA),
            new LightNovel("No Game No Life", 2.5, Categoria.DRAMA),
            new LightNovel("Naruto", 2, Categoria.FANTASIA),
            new LightNovel("Overlord", 3, Categoria.ROMANCE),
            new LightNovel("Fullmetal Alchemist", 3.1, Categoria.ROMANCE)));
    public static void main(String[] args) {
        Map<Promocao, List<LightNovel>> preco = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPreco() < 2 ? Promocao.SOBRE_PROMOCAO : Promocao.PRECO_NORMAL));
        System.out.println(preco);
        Map<Categoria, Map<Promocao, List<LightNovel>>> preco2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategoria,
                        Collectors.groupingBy(ln -> ln.getPreco() < 6 ? Promocao.SOBRE_PROMOCAO : Promocao.PRECO_NORMAL)));
        System.out.println(preco2);
    }
}
