package com.gabrielmaran.aprendendoExcecoes.exception.teste;

import com.gabrielmaran.aprendendoExcecoes.exception.dominio.Funcionario;
import com.gabrielmaran.aprendendoExcecoes.exception.dominio.LoginInvalidoException;
import com.gabrielmaran.aprendendoExcecoes.exception.dominio.Pessoa;


public class SobreEscritaComExceptionTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try{
            funcionario.salvar();
        }catch(LoginInvalidoException e ){
            e.printStackTrace();
        }
    }
}
