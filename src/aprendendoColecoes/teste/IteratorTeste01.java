package aprendendoColecoes.teste;

import aprendendoColecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTeste01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<Manga>();// O linkedlist é mais vantagjoso, quando se trata de remoçã de itens de um array
        mangas.add(new Manga(222L, "J", 156.8, 0));
        mangas.add(new Manga(444L, "A", 112.3, 5));
        mangas.add(new Manga(333L, "Z", 152.1, 0));
        mangas.add(new Manga(111L, "C", 123.5, 2));
        mangas.add(new Manga(555L, "D", 102.6,0));
        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()) {
//            if(mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0); //ele vai remover se, a variavel ed referencia criada "manga" ter a quantidade == 0
        System.out.println(mangas.toString());
    }
}
