package com.gabrielmaran.aprendendoClassesUtilitarias.regex.teste;

import java.util.Scanner;

public class ScannerTeste02 {
    public static void main(String[] args) {
        String texto = "Gabriel,Joao,Cleiton,true,200";
        Scanner scan = new Scanner(texto);
        scan.useDelimiter(",");
        while(scan.hasNext()) {
            if(scan.hasNextInt()) {
                System.out.println("Int: "+scan.nextInt());
            } else if (scan.hasNextBoolean()) {
                System.out.println("Boolean: "+scan.nextBoolean());
            } else {
                System.out.println("Line: "+scan.next());
            }
        }
    }
}
