package com.gabrielmaran.aprendendoObjetos.introMetodos.teste;

import com.gabrielmaran.aprendendoObjetos.introMetodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Joao";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 20;
        estudante2.sexo = 'F';
        estudante1.imprime();
        estudante2.imprime();
    }
}
