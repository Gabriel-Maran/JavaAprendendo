package com.gabrielmaran.aprendendoObjetos.polimorfismo.servico;

import com.gabrielmaran.aprendendoObjetos.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
