package com.gabrielmaran.aprendendoObjetos.associacao.exercicio.teste;

import com.gabrielmaran.aprendendoObjetos.associacao.exercicio.dominio.Estudante;
import com.gabrielmaran.aprendendoObjetos.associacao.exercicio.dominio.Professor;
import com.gabrielmaran.aprendendoObjetos.associacao.exercicio.dominio.Seminario;

import java.util.Scanner;

public class SeminarioTeste01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Seminario seminario1 = new Seminario("Reciclagem", "Auditório 01");
        Seminario seminario2 = new Seminario("Programação Orientada a Objetos", "Auditório 02");
        Estudante estudante1 = new Estudante("Carlos");
        Estudante estudante2 = new Estudante("Maria");
        Professor professor1 = new Professor("João");
        Estudante[] seminarioEstudantes01 = {estudante1};
        Estudante[] seminarioEstudantes02 = {estudante2};
        Seminario[] seminarios = {seminario1, seminario2};


        estudante1.setSeminario(seminario1);
        estudante2.setSeminario(seminario2);
        professor1.setSeminarios(seminarios);
        seminario1.setEstudantes(seminarioEstudantes01);
        seminario2.setEstudantes(seminarioEstudantes02);

        estudante1.imprime();
        estudante2.imprime();
        professor1.imprime();
        seminario1.imprime();
        seminario2.imprime();
    }
}
