package com.gabrielmaran.aprendendoOptional.teste;

import java.util.List;
import java.util.Optional;

public class OptionalTeste01 {
    //Nao criar parametros ou atributos com Optional, indicado para retornos
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Frase foda");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        Optional<String> findGabriel = findName("Gabriel");
        System.out.println(findGabriel);
        Optional<String> findJorge = findName("Jorge");
        System.out.println(findJorge);
//        Optional<String> nameOptional = Optional.ofNullable(findName("Gabriel"));
//        String isEmpty = nameOptional.orElse("EMPTY");
//        nameOptional.ifPresent(s-> System.out.println(s.toUpperCase()));
//        System.out.println(isEmpty);
    }

    private static Optional<String> findName(String name) {
        List<String> nomes = List.of("Gabriel", "João", "Cleiton", "Taffe");
        int i = nomes.indexOf(name);
        if(i != -1){
            return Optional.of(nomes.get(i));
        }
        return Optional.empty();
    }
}
