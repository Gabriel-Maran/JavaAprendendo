package exercicios.exs02.dominio;

public class Bicicleta extends Veiculo {
    private int numMarchas;
    private final double custoDiario = 20.00;

    public Bicicleta(String placa, String modelo, int numMarchas) {
        super(placa, modelo);
        this.numMarchas = numMarchas;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "placa='" + getPlaca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", disponivel=" + isDisponivel() + '\'' +
                ", numMarchas=" + getNumMarchas() + '\'' +
                ", custoDiario=" + getCustoDiario() + '\'' +
                '}';
    }

    @Override
    public double calcularCustoAluguel(int dias) {
        return this.custoDiario * dias;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public double getCustoDiario() {
        return custoDiario;
    }
}
