package aprendendoObjetos.heranca.exercicio.teste;

import aprendendoObjetos.heranca.exercicio.dominio.Caminhao;
import aprendendoObjetos.heranca.exercicio.dominio.Carro;
import aprendendoObjetos.heranca.exercicio.dominio.Moto;
import aprendendoObjetos.heranca.exercicio.dominio.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class TesteConcessionaria1 {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("A", "B", "C", 4, false));
        veiculos.add(new Moto("D", "E", "F",140, true));
        veiculos.add(new Caminhao("G", "H", 40, 3));

        System.out.println("---- Informações do(s) veículo(s): ----");

        for (Veiculo veiculo : veiculos){
            veiculo.imprime();
        }
    }
}
