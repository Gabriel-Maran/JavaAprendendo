package com.gabrielmaran.aprendendoObjetos.classesAbstratas.exercicio.dominio;

public class Horista extends Funcionario {
    private int horasTrabalhadas;
    private final double valorHora;
    public Horista(String nome, int horasTrabalhadas, double valorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public void calcularSalario() {
        setSalarioBase(this.valorHora * this.horasTrabalhadas);
    }
}
