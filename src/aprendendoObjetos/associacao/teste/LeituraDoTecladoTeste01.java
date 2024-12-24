package aprendendoObjetos.associacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.printf("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Digite F ou M para seu sexo: ");
        char sexo = scan.next().charAt(0);
        System.out.println("Nome: "+nome+". Idade: "+idade+". Sexo: "+sexo);

    }
}
