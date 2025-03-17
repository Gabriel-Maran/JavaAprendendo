package exercicios.exs01;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a posição que deseja saber dos números de Fibonacci");
        int posicao = sc.nextInt();
        System.out.println(fibonacci(posicao));
    }
    public static int fibonacci(int posicao) {
        //Tenho conhecimento que um dos melhores metodos é usando uma formula, mas estou tentando colocar os meus conhecimentos em pratica
        if(posicao == 1 || posicao == 2) { return 1;}
        return fibonacci(posicao - 1) + fibonacci(posicao - 2);
    }
}
