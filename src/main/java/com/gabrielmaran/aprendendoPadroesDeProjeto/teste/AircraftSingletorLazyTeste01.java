package com.gabrielmaran.aprendendoPadroesDeProjeto.teste;

import com.gabrielmaran.aprendendoPadroesDeProjeto.dominio.AircraftSingletonLazy;

public class AircraftSingletorLazyTeste01 {
    public static void main(String[] args) {
            bookeSeat("1A");
            bookeSeat("1A");

    }

    private static void bookeSeat(String seat) {
        System.out.println(AircraftSingletonLazy.getInstance());
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getInstance();
        System.out.println(aircraft.bookSeat(seat));
    }
}
