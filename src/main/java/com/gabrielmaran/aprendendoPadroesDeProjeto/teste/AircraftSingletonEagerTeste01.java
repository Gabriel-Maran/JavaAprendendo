package com.gabrielmaran.aprendendoPadroesDeProjeto.teste;

import com.gabrielmaran.aprendendoPadroesDeProjeto.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTeste01 {
    public static void main(String[] args) {
        bookeSeat("1A");
        bookeSeat("1A");
    }

    private static void bookeSeat(String seat){
        System.out.println(AircraftSingletonEager.getInstance());
        AircraftSingletonEager aircraft = AircraftSingletonEager.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
