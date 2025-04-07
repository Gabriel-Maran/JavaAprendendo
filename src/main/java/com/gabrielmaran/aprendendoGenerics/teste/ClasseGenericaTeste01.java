package com.gabrielmaran.aprendendoGenerics.teste;

import com.gabrielmaran.aprendendoGenerics.dominio.Barco;
import com.gabrielmaran.aprendendoGenerics.dominio.Carro;
import com.gabrielmaran.aprendendoGenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste01 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("CarroA"), new Carro("CarroB")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("barcoA"), new Barco("barcoB")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando por um mes...");
        rentalServiceCarro.retornarObjetoDisponivel(carro);
        System.out.println("--------------------------------------------");
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando por um mes...");
        rentalServiceBarco.retornarObjetoDisponivel(barco);
    }
}
