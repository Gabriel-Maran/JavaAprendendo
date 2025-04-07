package com.gabrielmaran.aprendendoPadroesDeProjeto.teste;

import com.gabrielmaran.aprendendoPadroesDeProjeto.dominio.AircraftSingletonEnum;

public class AircraftSingletonEnumTeste01 {
    public static void main(String[] args) {
        bookeSeat("1A");
        bookeSeat("1A");
    }

    private static void bookeSeat(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum aircraft = AircraftSingletonEnum.INSTANCE;
        System.out.println(aircraft.bookSeat(seat));
    }
}
