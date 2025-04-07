package com.gabrielmaran.aprendendoStreams.dominio;

import java.util.Objects;

public class LightNovel {
    private String nome;
    private double preco;
    private Categoria categoria;

    public LightNovel(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public LightNovel(String nome, double preco, Categoria categoria) {
        this(nome, preco);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria=" + categoria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
