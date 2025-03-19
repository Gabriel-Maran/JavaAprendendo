package exercicios.exs02.teste;

import exercicios.exs02.dominio.*;

public class AluguelVeiculoTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro("ABC-1234", "Fusca", 4);
        Moto moto = new Moto("XYZ-9876", "CG 160", 160);
        Cliente joao = new Cliente("João", "123.456.789-00");

        Locadora.adicionarVeiculo(carro);
        Locadora.adicionarVeiculo(moto);
        Locadora.adicionarCliente(joao);
        Locadora.gerarRelatorioVeiculos();

        Locadora.buscarVeiculoDisponivel("Fusca");
        Locadora.alugarVeiculo(joao, carro);
        System.out.println("Aluguel realizado!");
        Locadora.devolverVeiuclo(joao, carro, 3);
    }
}
