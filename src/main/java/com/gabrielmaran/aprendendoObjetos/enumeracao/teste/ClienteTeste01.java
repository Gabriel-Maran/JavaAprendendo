package com.gabrielmaran.aprendendoObjetos.enumeracao.teste;

import com.gabrielmaran.aprendendoObjetos.enumeracao.dominio.Cliente;
import com.gabrielmaran.aprendendoObjetos.enumeracao.dominio.TipoCliente;
import com.gabrielmaran.aprendendoObjetos.enumeracao.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente1", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Cliente4", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoCLientePorNomeRelatorio("Pessoa Física1");
        System.out.println(tipoCliente2);
    }
}
