package aprendendoGenerics.teste;

import java.util.ArrayList;
import java.util.List;

public class WildCardTeste02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat(), new Cat());
//        printConsulta(dogs); // os dois não funcionarão, podem ser filhos da class abstrata Animal, mas não funciona (diferente do Array, em que isso funciona)
//        printConsulta(cats); // Você tem que passar exatamente o que foi definido na sintaxe da função
    }
    //Type erasure
    private static void printConsulta(List<Animal> animals) {
        for(Animal animal : animals) {
            animal.consulta();
        }
        animals.add(new Dog());
    }
}
