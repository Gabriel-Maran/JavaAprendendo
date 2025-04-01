package aprendendoPadroesDeProjeto.teste;

import aprendendoPadroesDeProjeto.dominio.Aircraft;
import aprendendoPadroesDeProjeto.dominio.AircraftSingletonEager;

public class AircraftTeste01 {
    public static void main(String[] args) {
        bookeSeat("1A");
        bookeSeat("1A");
    }

    static void bookeSeat(String seat){
        Aircraft aircraft = new Aircraft("787-900");
        System.out.println(aircraft.bookSeat(seat));
    }
}
