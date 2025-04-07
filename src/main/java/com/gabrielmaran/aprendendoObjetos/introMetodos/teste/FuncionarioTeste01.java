package com.gabrielmaran.aprendendoObjetos.introMetodos.teste;

import com.gabrielmaran.aprendendoObjetos.introMetodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();
        Funcionario base = new Funcionario();
        funcionario1.setNome("Carlos");
        funcionario1.setIdade(20);
        funcionario1.setSalario(2058.9);

        funcionario2.setNome("Pedro");
        funcionario2.setIdade(20);
        funcionario2.setSalario(5082.85);

        funcionario3.setNome("Joao");
        funcionario3.setIdade(20);
        funcionario3.setSalario(10095.45);

        funcionario1.impressoraDados();
        funcionario2.impressoraDados();
        funcionario3.impressoraDados();
        Funcionario.calcularMediaSalario(funcionario1.getSalario(), funcionario2.getSalario(), funcionario3.getSalario());
        System.out.println("--------------------------------------");
        funcionario3.aumentoSalario(0.3);
        System.out.println(funcionario1.getSalario());
        System.out.println("--------------------------------------");
        funcionario2.maiorDeIdade();
        System.out.println("--------------------------------------");
        Funcionario.compDoisSalarios(funcionario1.getSalario(), funcionario2.getSalario());
        System.out.println("--------------------------------------");
        Funcionario.totalSalarios(funcionario1.getSalario(), funcionario2.getSalario(), funcionario3.getSalario());
        System.out.println("--------------------------------------");
        Funcionario.melhorPago(funcionario1.getSalario(), funcionario2.getSalario(), funcionario3.getSalario());
        System.out.println("--------------------------------------");

    }

}
