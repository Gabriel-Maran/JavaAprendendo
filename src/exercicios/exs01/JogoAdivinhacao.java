package exercicios.exs01;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRandom = new Random().nextInt(100);
        System.out.println(numRandom);
        int tentativa = -1;
        while(tentativa != numRandom) {
            System.out.println("Adivinhe um número de 0-100: ");
            tentativa = sc.nextInt();
            if(tentativa > numRandom) {
                System.out.println("O número procurado é menor");
            }else if(tentativa < numRandom) {
                System.out.println("O número procurado é maior");
            }
        }
        System.out.println("Parabens, você acertou o núnero!!");
        sc.close();

    }
}
