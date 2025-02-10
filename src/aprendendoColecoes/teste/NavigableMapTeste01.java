package aprendendoColecoes.teste;

import aprendendoColecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTeste01 {
    public static void main(String[] args) {
//        Consumidor consumidor1 = new Consumidor("Gabriel");
//        Consumidor consumidor2 = new Consumidor("Joao");
        NavigableMap<String, String> nMapStrCons = new TreeMap<>();

//        NavigableMap<String, Consumidor> nMapStrCons = new TreeMap<>();
//        NavigableMap<Consumidor, Consumidor> nMapStrCons = new TreeMap<>();// Ou passa um comparator ou a classe tem que impplementar comparable,caso seja Navegada entre duas classes,   para que seja possivel reconhecer o que vai ser compparado
//        nMapStrCons.put("Gabriel", consumidor1);
//        nMapStrCons.put("Joao", consumidor2);

        nMapStrCons.put("A", "Letra A");
        nMapStrCons.put("D", "Letra D");
        nMapStrCons.put("C", "Letra C");
        nMapStrCons.put("E", "Letra E");
        nMapStrCons.put("B", "Letra B");
        for (Map.Entry<String, String> entry : nMapStrCons.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(nMapStrCons.headMap("C", true)); // retorna todos que são "menores" que a chave passada, caso seja adiocionado o true ("C" , true), ele irá retornar todos os anteriores,contadndo com a chave que foi passada
        System.out.println(nMapStrCons.lowerEntry("D"));
        System.out.println(nMapStrCons.floorEntry("D"));
        System.out.println(nMapStrCons.higherEntry("D"));
        System.out.println(nMapStrCons.ceilingEntry("D"));

        // lower <
        // floor <=
        // higher >
        // ceiling =>
    }
}
