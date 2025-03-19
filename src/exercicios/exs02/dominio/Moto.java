package exercicios.exs02.dominio;

public class Moto extends Veiculo {
    private int cilindradas;
    private final double custoDiario = 50.00;

    public Moto(String placa, String modelo, int cilindradas) {
        super(placa, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "placa='" + getPlaca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", disponivel=" + isDisponivel() + '\'' +
                ", cilindradas=" + getCilindradas() + '\'' +
                ", custoDiario=" + getCustoDiario() + '\'' +
                '}';
    }

    @Override
    public double calcularCustoAluguel(int dias) {
        return this.custoDiario * dias;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public double getCustoDiario() {
        return custoDiario;
    }
}
