package aprendendoObjetos.associacao.teste;

import aprendendoObjetos.associacao.dominio.Jogador;
import aprendendoObjetos.associacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Jogador1");
        Jogador jogador2 = new Jogador("Jogador2");
        Time time1 = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};
        jogador1.setTime(time1);
        jogador2.setTime(time1);
        time1.setJogadores(jogadores);
        System.out.println("--- Jogadores ---");
        jogador1.imprime();
        jogador2.imprime();
        System.out.println("--- Time ---");
        time1.imprime();
    }
}
