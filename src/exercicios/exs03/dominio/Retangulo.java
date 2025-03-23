package exercicios.exs03.dominio;

import exercicios.exs03.exceptions.FormaInvalidaException;

public class Retangulo implements Forma {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        if(base<0 || altura<0){
            throw new FormaInvalidaException("Dimensão invalida");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return base * altura;
    }

    @Override
    public double calcularArea() {
        return 2 * base + 2 * altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
