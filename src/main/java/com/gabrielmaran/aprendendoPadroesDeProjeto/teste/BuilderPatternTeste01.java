package com.gabrielmaran.aprendendoPadroesDeProjeto.teste;

import com.gabrielmaran.aprendendoPadroesDeProjeto.dominio.Person;

public class BuilderPatternTeste01 { //Muito mais facil de outras pessoas entenderem
    //DevDojo, aula 246, Builder
    public static void main(String[] args) {
        Person person1 = Person.PersonBuilder.builder()
                .firstName("Sei")
                .lastName("La")
                .username("SeiLaBrabo123")
                .email("seilabrabo123@gmail.com")
                .build();

        System.out.println(person1.toString());
    }
}
