package com.gabrielmaran.aprendendoObjetos.polimorfismo.servico;

import com.gabrielmaran.aprendendoObjetos.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
