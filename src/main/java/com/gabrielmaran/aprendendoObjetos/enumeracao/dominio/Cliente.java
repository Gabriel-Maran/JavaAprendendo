package com.gabrielmaran.aprendendoObjetos.enumeracao.dominio;

public class Cliente {


    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome ='" + nome + '\'' +
                ", tipoCliente= " + tipoCliente +
                ", tipoClienteRElatorio= " + tipoCliente.getNomeRelatorio() +
                ", tipoClienteInt= " + tipoCliente.VALOR +
                ", tipoPagamento= " + tipoPagamento +
                '}';
    }
}
