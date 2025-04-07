package com.gabrielmaran.aprendendoObjetos.classesAbstratas.exercicio.dominio;

import java.util.ArrayList;

public class FolhaPagamento {
    public void imprimirFolha(ArrayList<Funcionario> funcionarios) {
        for(Funcionario funcio : funcionarios) {
            funcio.calcularSalario();
            System.out.println("--- Funcionario Info: ----");
            System.out.println("Nome: " + funcio.getNome());
            System.out.println("Salario: " + funcio.getSalarioBase());
            System.out.println("--------------------------");
        }
    }
}
