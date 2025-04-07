package com.gabrielmaran.aprendendoPadroesDeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> availabreSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    {
        availabreSeats.add("1A");
        availabreSeats.add("1B");
    }

    public static AircraftSingletonEager getInstance() {
            return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        if(availabreSeats.contains(seat)) {
            return availabreSeats.remove(seat);
        }
        return false;
    }
}
