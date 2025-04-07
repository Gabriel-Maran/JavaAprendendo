package com.gabrielmaran.aprendendoObjetos.heranca.teste;

import com.gabrielmaran.aprendendoObjetos.heranca.dominio.Endereco;
import com.gabrielmaran.aprendendoObjetos.heranca.dominio.Funcionario;
import com.gabrielmaran.aprendendoObjetos.heranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua 1");
        endereco1.setCep("012345-678");
        Pessoa pessoa1 = new Pessoa("Pessoa 1");
        pessoa1.setCpf("11111111111");
        pessoa1.setEndereco(endereco1);
        pessoa1.imprime();
        System.out.println("-------------------------------");

        Funcionario funcionario1 = new Funcionario("Funcionario 1");
        funcionario1.setCpf("22222222222");
        funcionario1.setEndereco(endereco1);
        funcionario1.setSalario(20000);

        funcionario1.imprime();
        funcionario1.relatorioPagamento();
    }
}
