package com.gabrielmaran.aprendendoObjetos.associacao.exercicio.teste;

import com.gabrielmaran.aprendendoObjetos.associacao.exercicio.dominio.Atleta;
import com.gabrielmaran.aprendendoObjetos.associacao.exercicio.dominio.Clube;

public class ClubeTeste01 {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("João");
        Atleta atleta2 = new Atleta("Pedro");
        Atleta atleta3 = new Atleta("Joana");
        Atleta atleta4 = new Atleta("Pietra");
        Clube clube1 = new Clube("Clube 1");
        Clube clube2 = new Clube("Clube 2");
        Atleta[] addClubes1 = {atleta1, atleta2};
        Atleta[] addClubes2 = {atleta3, atleta4};

        atleta1.setClube(clube1);
        atleta2.setClube(clube1);
        atleta3.setClube(clube2);
        atleta4.setClube(clube2);
        clube1.setAtletas(addClubes1);
        clube2.setAtletas(addClubes2);

        atleta1.imprime();
        atleta2.imprime();
        atleta3.imprime();
        atleta4.imprime();
        clube1.imprime();
        clube2.imprime();


    }
}
