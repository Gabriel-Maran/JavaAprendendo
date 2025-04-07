package com.gabrielmaran.aprendendoObjetos.polimorfismo.dominio;

public class Televisao extends Produto{
    public static final double imposto = 0.21;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Televisão");
        return this.valor * imposto;
    }
}
