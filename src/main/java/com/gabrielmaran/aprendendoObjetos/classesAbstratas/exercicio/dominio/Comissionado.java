package com.gabrielmaran.aprendendoObjetos.classesAbstratas.exercicio.dominio;

public class Comissionado extends Funcionario{
    private double vendas;
    public Comissionado(String nome, double salarioBase, double vendas) {
        super(nome, salarioBase);
        this.vendas = vendas;
    }

    @Override
    public void calcularSalario() {
        setSalarioBase(getSalarioBase() + vendas * 0.1);
    }
}
