package com.gabrielmaran.exercicios.exs02.dominio;

public class Carro extends Veiculo {
    private int numPassageiros;
    private final double custoDiario = 80.00;

    public Carro(String placa, String modelo, int numPassageiros) {
        super(placa, modelo);
        this.numPassageiros = numPassageiros;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + getPlaca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", disponivel=" + isDisponivel() + '\'' +
                ", numPassageiros=" + getNumPassageiros() + '\'' +
                ", custoDiario=" + getCustoDiario() + '\'' +
                '}';
    }

    @Override
    public double calcularCustoAluguel(int dias) {
        return this.custoDiario * dias;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public double getCustoDiario() {
        return custoDiario;
    }
}
