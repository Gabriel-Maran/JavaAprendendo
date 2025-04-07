package com.gabrielmaran.aprendendoObjetos.classesAbstratas.dominio;

public abstract class Funcionario extends Pessoa { //É como se a classe funcionario se tornasse um modelo/teamplate para suas extensões(filhos)
    //não pode misturar final e abstratc, pq o abstratic vai ser divido com filhos dele e o final seria o ultimo que pode utilizar o que está na classe
    //não pode criar um objeto da classe abstrata
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    @Override
    public void imprime() {//não obrigatorio, pois é abstrato
        System.out.println("Imprimindo...");
    }

    public abstract void calcularBonus(); //força todos os filhos a terem o 'calcularBonus' em suas composições

}
