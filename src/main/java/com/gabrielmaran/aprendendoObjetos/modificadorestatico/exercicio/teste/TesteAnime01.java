package com.gabrielmaran.aprendendoObjetos.modificadorestatico.exercicio.teste;


import com.gabrielmaran.aprendendoObjetos.modificadorestatico.exercicio.dominio.Anime;

public class TesteAnime01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Anime1", "Genero1");
        Anime anime2 = new Anime("Anime2", "Genero2");
        Anime   anime3 = new Anime("Anime3", "Genero3");
        Anime.exibirEpisodiosPares();
        Anime.exibirEpisodiosPares();
        Anime.exibirEpisodiosPares();
        System.out.println("Quantidade de objetos 'Anime': "+Anime.getContadorObjetos());
    }
}
