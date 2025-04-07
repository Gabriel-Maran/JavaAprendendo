package com.gabrielmaran.aprendendoExcecoes.exception.dominio;

public class Funcionario extends Pessoa {
    public void salvar() throws LoginInvalidoException {
        System.out.println("Salvando Funcionario");
    }
}
