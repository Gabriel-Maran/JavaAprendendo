package com.gabrielmaran.aprendendoObjetos.introMetodos.teste;

import com.gabrielmaran.aprendendoObjetos.introMetodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double n1, n2, resultado;
        Integer escolha;
        Calculadora calculadora = new Calculadora();
        System.out.println("Digite o primeiro número:");
        n1 = scan.nextDouble();
        System.out.println("Digite o segundo número:");
        n2 = scan.nextDouble();
        System.out.println("1-Soma; 2-Subtração; 3-Multiplicação; 4-Divisão");
        escolha = scan.nextInt();
        if (escolha == 1) {
            calculadora.somaDoisNumeros(n1, n2);
        } else if (escolha == 2) {
            calculadora.subDoisNumeros(n1, n2);
        } else if (escolha == 3) {
            resultado = calculadora.multiDoisNumeros(n1, n2);
            System.out.println(resultado);
            //Outra maneira:
            //System.out.println(calculadora.multiDoisNumeros(n1,n2));
        } else if (escolha == 4) {
            calculadora.divDoisNumeros(n1, n2);
        }

    }
}
