package com.gabrielmaran.aprendendoObjetos.sobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void immprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Episodios: "+this.episodios);
        System.out.println("Genero: "+this.genero);
    }
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    // Outro metodo, ao inves de usar o init, podemos fazer cada get e set separado
    //    public void setTipo(String tipo){
    //        this.tipo = tipo;
    //    }
    //    public void setEposodios(int espisodios){
    //        this.episodios = espisodios;
    //    }
    //    public String getTipo(){
    //        return this.tipo;
    //    }
    //    public int getEpisodios(){
    //        return this.episodios;
    //    }
    //    public void setNome(String nome){
    //        this.nome = nome;
    //    }
    //    public String getNome(){
    //        return this.nome;
    //    }
    //
    //    public String getGenero() {
    //        return genero;
    //    }
    //
    //    public void setGenero(String genero) {
    //        this.genero = genero;
    //    }
}
