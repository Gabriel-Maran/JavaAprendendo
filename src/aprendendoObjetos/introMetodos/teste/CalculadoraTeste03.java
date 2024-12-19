package aprendendoObjetos.introMetodos.teste;

import aprendendoObjetos.introMetodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String... args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Calculadora calculadora = new Calculadora();
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}
