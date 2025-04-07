package com.gabrielmaran.aprendendoGenerics.service;

import java.util.List;

public class RentalService<T> { // O T se refere a o tipo de objeto que será passado, que não conseguimos saber de imediato
    private List<T> objetosDisponiveis;
    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }
    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objeto disponivel");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando Carro: "+t);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoDisponivel(T t){
        System.out.println("Devolvendo o carro "+t);
        objetosDisponiveis.add(t);
        System.out.println("Carros disponiveis para alugar:");
        System.out.println(objetosDisponiveis);
    }
}
