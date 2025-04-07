package com.gabrielmaran.AprendendoParametrizacaoComportamentos.teste;

import com.gabrielmaran.AprendendoParametrizacaoComportamentos.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTeste01 {
    public static List<Carro> listaCarros = List.of(new Carro("green", 2011), new Carro("red", 1998), new Carro("yellow", 2000));

    public static void main(String[] args) {
        System.out.println(filterGreenCarros(listaCarros));
        System.out.println("-----------------------------------------------");
        System.out.println(filterCarsByColor(listaCarros, "red"));
    }

    private static List<Carro> filterGreenCarros(List<Carro> carros) {
        List<Carro> greenCarros = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getColor().equals("green")) {
                greenCarros.add(carro);
            }
        }
        return greenCarros;
    }

    private static List<Carro> filterCarsByColor(List<Carro> carros, String color) {
        List<Carro> filteredCar = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getColor().equals(color.trim())) {
                filteredCar.add(carro);
            }
        }
        return filteredCar;
    }
}
