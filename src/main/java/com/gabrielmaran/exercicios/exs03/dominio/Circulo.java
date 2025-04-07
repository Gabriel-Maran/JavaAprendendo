package com.gabrielmaran.exercicios.exs03.dominio;

import com.gabrielmaran.exercicios.exs03.exceptions.FormaInvalidaException;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        if(raio<0){
            throw new FormaInvalidaException("Dimensão invalida");
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (Math.PI * (raio * raio));
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
