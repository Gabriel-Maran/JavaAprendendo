package com.gabrielmaran.aprendendoObjetos.associacao.exercicio.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("---- Time ----");
        System.out.println("Nome: " + nome);
        if(jogadores == null) return;
        for(Jogador jogador : jogadores){
            System.out.println("Jogador: " + jogador.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
