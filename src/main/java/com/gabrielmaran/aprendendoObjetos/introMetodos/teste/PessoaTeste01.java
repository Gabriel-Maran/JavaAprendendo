package com.gabrielmaran.aprendendoObjetos.introMetodos.teste;

import com.gabrielmaran.aprendendoObjetos.introMetodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.imprime();
        pessoa1.setNome("Gabriel");
        pessoa1.setIdade(18);
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
    }
}
