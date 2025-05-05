package com.gabrielmaran.aprendendoJUnit.dominio;

import java.util.Objects;

public record Manga(String name, int episodes) {
//Imutavel, final, atributos não podem ser alterados, pode usar public, private
//Veio para facilitar a criação de classes, para não ter que criar getters, setters...

    //    private String producer; //Não se pode criar instâncias/atributos não estáticos
    //    {this.episodes = 1;} //Não se pode criar criar blocos de inicialização não estáticos
    //    Não é recomendado criar um construtor canonical
    public Manga { //Esse contrutor é o recomendado
        Objects.requireNonNull(name);
    }
}
