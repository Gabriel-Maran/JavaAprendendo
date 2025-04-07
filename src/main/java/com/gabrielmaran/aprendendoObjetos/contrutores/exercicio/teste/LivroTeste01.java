package com.gabrielmaran.aprendendoObjetos.contrutores.exercicio.teste;

import com.gabrielmaran.aprendendoObjetos.contrutores.exercicio.dominio.Livro;

public class LivroTeste01 {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Titulo", "Autor", 100, 0, "Editora");
        Livro livro2 = new Livro("Titulo", "Autor", 100, 0);
        Livro livro3 = new Livro();
        livro1.imprime();
        livro2.imprime();
        livro3.imprime();
    }
}
