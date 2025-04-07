package com.gabrielmaran.aprendendoObjetos.modificadorestatico.exercicio.dominio;

public class Anime {
    private String nome;
    private String genero;
    private static int[] episodios;
    private static int contadorObjetos = 0;
    static {
        episodios = new int[100];
        for(int i = 0; i<episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    public Anime(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
        contadorObjetos++;
    }

    public static int getContadorObjetos() {
        return contadorObjetos;
    }
    public static void exibirEpisodiosPares(){
        System.out.println("Episodios pares: ");
        for(int episodio : episodios) {
            if (episodio % 2 == 0) {
                System.out.print(episodio+" ");
            }
        }
        System.out.println();
    }
}
