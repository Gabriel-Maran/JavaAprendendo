package com.gabrielmaran.aprendendoGenerics.teste;

abstract class Animal {
    public abstract void consulta();
}

class Dog extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando o cachorro");
    }
}

class Cat extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando o gato");
    }
}

public class WildCardTeste01 {
    public static void main(String[] args) {
        Dog[] cachorros = {new Dog(), new Dog()} ;
        Cat[] gatos = {new Cat(), new Cat()} ;
        printConsulta(cachorros);
        printConsulta(gatos);
        Animal[] animals = {new Dog(), new Cat()} ;
        printConsulta(animals);
    }
    private static void printConsulta(Animal[] a) {
        for(Animal animal : a) {
            animal.consulta();
        }
    }
}
