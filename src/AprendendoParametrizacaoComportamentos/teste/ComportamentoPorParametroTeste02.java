package AprendendoParametrizacaoComportamentos.teste;

import AprendendoParametrizacaoComportamentos.dominio.Carro;
import AprendendoParametrizacaoComportamentos.interfaces.CarroPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTeste02 {
    public static List<Carro> listaCarros = List.of(new Carro("green", 2011), new Carro("red", 1998), new Carro("yellow", 2000));

    public static void main(String[] args) {

        System.out.println(filter(listaCarros, carro -> carro.getColor().equals("green")));
        System.out.println(filter(listaCarros, carro -> carro.getYear() < (2000)));
//        filter(listaCarros, new CarroPredicate() {
//            @Override
//            public boolean test(Carro carro) {
//                return carro.getColor().equals("red");
//            }
//
//        });
    }

    private static List<Carro> filter(List<Carro> carros, CarroPredicate carroPredicate) {
        List<Carro> filteredCar = new ArrayList<>();
        for (Carro carro : carros) {
            if (carroPredicate.test(carro)) {
                filteredCar.add(carro);
            }
        }
        return filteredCar;
    }
}
