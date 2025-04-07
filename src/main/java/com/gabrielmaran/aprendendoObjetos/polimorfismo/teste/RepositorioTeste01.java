package com.gabrielmaran.aprendendoObjetos.polimorfismo.teste;

import com.gabrielmaran.aprendendoObjetos.polimorfismo.repositorio.Repositorio;
import com.gabrielmaran.aprendendoObjetos.polimorfismo.servico.RepositorioArquivo;
import com.gabrielmaran.aprendendoObjetos.polimorfismo.servico.RepositorioBancoDeDados;
import com.gabrielmaran.aprendendoObjetos.polimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        repositorio = new RepositorioArquivo();
        repositorio.salvar();
        repositorio = new RepositorioMemoria();
        repositorio.salvar();

    }
}
