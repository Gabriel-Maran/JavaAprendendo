package aprendendoClassesUtilitarias.datas.teste;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTeste01 {
    public static void main(String[] args) { //Interessante para aplicacões, onde o tempop 'now' é sempre o mesmo em todos os lugares "zulu time"
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(Instant.ofEpochSecond(9999999, 23));
    }
}
