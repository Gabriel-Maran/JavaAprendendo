package aprendendoColecoes.teste;

import aprendendoColecoes.dominio.Consumidor;
import aprendendoColecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTeste02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Gabriel");
        Consumidor consumidor2 = new Consumidor("Joao");

        Manga manga1 =new Manga(222L, "J", 156.8);
        Manga manga2 =new Manga(444L, "A", 112.3);
        Manga manga3 =new Manga(333L, "Z", 152.1);
        Manga manga4 =new Manga(111L, "C", 123.5);
        Manga manga5 =new Manga(555L, "D", 102.6);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga2);
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println("O consumidor "+entry.getKey().getNome()+" comprou o manga "+entry.getValue().getNome());
        }
    }
}
