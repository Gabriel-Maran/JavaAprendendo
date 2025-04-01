package aprendendoPadroesDeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
    INSTANCE;
    private final Set<String> availabreSeats;

    AircraftSingletonEnum() {
        this.availabreSeats = new HashSet<>();
        this.availabreSeats.add("1A");
        this.availabreSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        if (availabreSeats.contains(seat)) {
            synchronized (AircraftSingletonLazy.class) {
                return availabreSeats.remove(seat);
            }
        }
        return false;
    }

}
