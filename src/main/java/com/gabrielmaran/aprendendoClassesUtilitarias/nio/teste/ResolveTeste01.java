package com.gabrielmaran.aprendendoClassesUtilitarias.nio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTeste01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/gabriel");//Caminho Relativo
//        Paths.get("/home/gabriel");//Caminho Absoluto
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve1 = dir.resolve(arquivo);
        System.out.println(resolve1);

        Path absoluto = Paths.get("/home/gabriel");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("abc.txt");
        System.out.println("1: "+absoluto.resolve(relativo));
        System.out.println("2: "+absoluto.resolve(file));
        System.out.println("3: "+relativo.resolve(absoluto));
        System.out.println("4: "+relativo.resolve(file));
        System.out.println("5: "+file.resolve(absoluto));
        System.out.println("6: "+file.resolve(relativo));
    }
}
