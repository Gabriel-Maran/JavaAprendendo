package com.gabrielmaran.aprendendoObjetos.associacao.teste;

import com.gabrielmaran.aprendendoObjetos.associacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Jogador1");
        Jogador jogador2 = new Jogador("Jogador2");
        Jogador jogador3 = new Jogador("Jogador3");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
