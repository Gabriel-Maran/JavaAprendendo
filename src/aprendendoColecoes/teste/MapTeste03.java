package aprendendoColecoes.teste;

import aprendendoColecoes.dominio.Consumidor;
import aprendendoColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTeste03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Gabriel");
        Consumidor consumidor2 = new Consumidor("Joao");

        Manga manga1 =new Manga(222L, "J", 156.8);
        Manga manga2 =new Manga(444L, "A", 112.3);
        Manga manga3 =new Manga(333L, "Z", 152.1);
        Manga manga4 =new Manga(111L, "C", 123.5);
        Manga manga5 =new Manga(555L, "D", 102.6);

        List<Manga> listMangaConsumidor1 = List.of(manga1,manga2,manga3);
        List<Manga> listMangaConsumidor2 = List.of(manga3,manga4,manga5);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, listMangaConsumidor1);
        consumidorMangaMap.put(consumidor2, listMangaConsumidor2);

        for(Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.print(entry.getKey().getNome()+ " - ");
            for(Manga manga : entry.getValue()){
                System.out.print(manga.getNome()+", ");
            }
            System.out.println();
        }
    }
}
