package com.gabrielmaran.aprendendoObjetos.polimorfismo.exercicio.teste;

import com.gabrielmaran.aprendendoObjetos.polimorfismo.exercicio.dominio.Boleto;
import com.gabrielmaran.aprendendoObjetos.polimorfismo.exercicio.dominio.CartaoCredito;
import com.gabrielmaran.aprendendoObjetos.polimorfismo.exercicio.dominio.Pix;
import com.gabrielmaran.aprendendoObjetos.polimorfismo.exercicio.servico.ProcessadorDePagamentos;

public class PagamentoTeste01 {
    public static void main(String[] args) {
        CartaoCredito cartaoCredito = new CartaoCredito("4444");
        Boleto boleto = new Boleto( "316231231231231251231");
        Pix pix = new Pix("1231235612312");
        ProcessadorDePagamentos.executarPagamento(cartaoCredito, 123123);
        ProcessadorDePagamentos.executarPagamento(boleto, 312321);
        ProcessadorDePagamentos.executarPagamento(pix, 231231);
    }
}
