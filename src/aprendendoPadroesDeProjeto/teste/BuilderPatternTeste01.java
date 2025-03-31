package aprendendoPadroesDeProjeto.teste;

import aprendendoPadroesDeProjeto.dominio.Person;

public class BuilderPatternTeste01 { //Muito mais facil de outras pessoas entenderem
    //DevDojo, aula 246, Builder
    public static void main(String[] args) {
        Person person1 = new Person.PersonBuilder()
                .firstName("Sei")
                .lastMame("La")
                .username("SeiLaBrabo123")
                .email("seilabrabo123@gmail.com")
                .build();
        System.out.println(person1.toString());
    }
}
