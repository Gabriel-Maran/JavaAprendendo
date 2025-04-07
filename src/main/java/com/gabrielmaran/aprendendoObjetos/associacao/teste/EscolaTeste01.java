package com.gabrielmaran.aprendendoObjetos.associacao.teste;

import com.gabrielmaran.aprendendoObjetos.associacao.dominio.Escola;
import com.gabrielmaran.aprendendoObjetos.associacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        //relação unidirecional de muitos para um (varios professores para uma escola)
        Professor professor1 = new Professor("Professor1");
        Professor professor2 = new Professor("Professor2");
        Professor[] professores = {professor1, professor2};
        Escola escola1 = new Escola("Escola1", professores);
        escola1.imprime();
    }
}
