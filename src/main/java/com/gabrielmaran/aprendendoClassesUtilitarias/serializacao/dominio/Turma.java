package com.gabrielmaran.aprendendoClassesUtilitarias.serializacao.dominio;

public class Turma {
    private String nome;

    public Turma(String turma) {
        this.nome = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "turma='" + nome + '\'' +
                '}';
    }
}
