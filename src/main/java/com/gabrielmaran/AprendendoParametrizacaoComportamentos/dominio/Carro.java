package com.gabrielmaran.AprendendoParametrizacaoComportamentos.dominio;

public class Carro {
    private String nome = "Audi";
    private String color;
    private int year;

    public Carro(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public String getNome() {
        return nome;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
