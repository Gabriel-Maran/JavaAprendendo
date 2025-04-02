package aprendendoPadroesDeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class Aircraft {
    private  final Set<String> availabreSeats = new HashSet<>();
    private final String name;
    {
        availabreSeats.add("1A");
        availabreSeats.add("1B");
    }

    public Aircraft(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean bookSeat(String seat) {
        if(availabreSeats.contains(seat)) {
            return availabreSeats.remove(seat);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "availabreSeats=" + availabreSeats +
                ", name='" + name + '\'' +
                '}';
    }
}
