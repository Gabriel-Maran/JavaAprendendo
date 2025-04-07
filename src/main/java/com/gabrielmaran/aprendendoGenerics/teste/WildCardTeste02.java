package com.gabrielmaran.aprendendoGenerics.teste;

import java.util.List;

public class WildCardTeste02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat(), new Cat());
        List<Animal> animals = List.of(new Dog(), new Cat());
//        printConsulta(dogs); // os dois não funcionarão, podem ser filhos da class abstrata Animal, mas não funciona (diferente do Array, em que isso funciona)
//        printConsulta(cats); // Você tem que passar exatamente o que foi definido na sintaxe da função
        printConsulta(dogs);
        printConsulta(cats);
        printConsulta(animals);
        printConsulta(dogs);

    }
    //Type erasure
    //Wildcard (?)
    private static void printConsulta(List<? extends Animal> animals) { //aceita qualquer tipo de lista que extenda animal (so pode usar extends)
        //Não se pode adicionar elementos na lista aqui
        for(Animal animal : animals) {
            animal.consulta();
        }
    }
    private static void printConsultaAnimal(List<? super Animal> animals) { // Pode receber animal ou qualquer um que seja pai
        animals.add(new Dog());
        animals.add(new Cat());
    }
}
