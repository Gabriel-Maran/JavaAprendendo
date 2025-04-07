package com.gabrielmaran.aprendendoObjetos.associacao.exercicio.dominio;

public class Seminario {
    private String nome;
    private Estudante[] estudantes;
    private String local;

    public Seminario(Estudante[] todosAlunos, String nome, String local) {
        this(nome, local);
        this.estudantes = todosAlunos;
    }

    public Seminario(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public void imprime() {
        System.out.println("--- Seminário ---");
        System.out.println("Nome: " + getNome());
        System.out.println("Local: " + getLocal());
        if (estudantes == null) return;
        for (Estudante estudante : this.estudantes) {
            System.out.println("Estudante: " + estudante.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public String getLocal() {
        return local;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstudantes(Estudante[] alunos) {
        this.estudantes = alunos;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
