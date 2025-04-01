package aprendendoPadroesDeProjeto.teste;

import aprendendoPadroesDeProjeto.dominio.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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
