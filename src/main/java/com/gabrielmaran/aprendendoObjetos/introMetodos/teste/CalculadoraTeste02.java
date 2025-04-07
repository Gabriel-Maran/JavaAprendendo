package com.gabrielmaran.aprendendoObjetos.introMetodos.teste;

import com.gabrielmaran.aprendendoObjetos.introMetodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Double n1 = 10.5;
        Double n2 = 15.0;
        calculadora.alteraDoisNumeros(n1, n2);
        System.out.println("Dentro do CalculadoraTeste02");
        System.out.println("N1: "+n1);
        System.out.println("N2: "+n2);
    }
}
