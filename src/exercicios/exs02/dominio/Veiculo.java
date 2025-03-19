package exercicios.exs02.dominio;

public abstract class Veiculo {
    private final String placa;
    private final String modelo;
    private boolean disponivel;

    public Veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
        this.disponivel = true;
    }

    public abstract double calcularCustoAluguel(int dias);

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
