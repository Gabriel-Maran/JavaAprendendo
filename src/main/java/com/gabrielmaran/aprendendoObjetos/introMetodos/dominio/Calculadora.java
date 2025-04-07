package com.gabrielmaran.aprendendoObjetos.introMetodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(Double n1, Double n2) {
        System.out.println(n1 + n2);
    }

    public void subDoisNumeros(Double n1, Double n2) {
        System.out.println(n1 - n2);
    }

    public Double multiDoisNumeros(Double n1, Double n2) {
        return n1 * n2;
    }

    public void divDoisNumeros(Double n1, Double n2) {
        if (n2 != 0) {
            System.out.println(n1 / n2);
            return;
        }
        System.out.println("Não é possivel a divisão por zero");
        //Pode ser feito com else tbm, ao inves de utilizar "return"

    }

    public void alteraDoisNumeros(Double n1, Double n2) {
        n1 = 10.0;
        n2 = 30.0;
        System.out.println("-----------------------------");
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("N1: " + n1);
        System.out.println("N2: " + n2);
        System.out.println("-----------------------------");
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
    //VarArgs(...) tem que ser a ultimo parametro que a função recebe, pois o VarArgs transforma o que esta sendo recebido em um array
    //Se ele não for o ultimo, ele não saberá quando para essa "junção" dos números, mas se ele for o ultimo, ele vai pegar os que restam
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}


