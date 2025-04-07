package com.gabrielmaran.aprendendoObjetos.associacao.teste;

import com.gabrielmaran.aprendendoObjetos.associacao.dominio.Jogador;
import com.gabrielmaran.aprendendoObjetos.associacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Jogador1");
        Time time1 = new Time("Seleção Brasieleira");
        Jogador jogador2 = new Jogador("Jogador2");
        jogador1.setTime(time1);
        jogador1.imprime();
        jogador2.imprime();
    }
}
