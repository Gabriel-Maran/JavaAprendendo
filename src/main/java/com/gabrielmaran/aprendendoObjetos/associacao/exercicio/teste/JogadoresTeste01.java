package com.gabrielmaran.aprendendoObjetos.associacao.exercicio.teste;

import com.gabrielmaran.aprendendoObjetos.associacao.exercicio.dominio.Jogador;
import com.gabrielmaran.aprendendoObjetos.associacao.exercicio.dominio.Time;

public class JogadoresTeste01 {
    public static void main(String[] args) {
        Time time1 = new Time("Argentina");
        Time time2 = new Time("Alemanha");
        Jogador jogador1 = new Jogador("Messi");
        Jogador jogador2 = new Jogador("Di María");
        Jogador jogador3 = new Jogador("Kroos");
        Jogador jogador4 = new Jogador("Neuer");
        Jogador[] jogadoresArg = {jogador1, jogador2};
        Jogador[] jogadoresAlm = {jogador3, jogador4};
        jogador1.setTime(time1);
        jogador2.setTime(time1);
        jogador3.setTime(time2);
        jogador4.setTime(time2);
        time1.setJogadores(jogadoresArg);
        time2.setJogadores(jogadoresAlm);
        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();
        jogador4.imprime();
        time1.imprime();
        time2.imprime();
    }
}
