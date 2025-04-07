package com.gabrielmaran.aprendendoClassesUtilitarias.nio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoClassesUtilitarias\\nio\\teste\\arquivo\\file.txt");
        Path p2 = Paths.get("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoClassesUtilitarias\\nio\\teste\\arquivo", "file.txt");
        Path p3 = Paths.get("C:", "Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoClassesUtilitarias\\nio\\teste\\arquivo", "file.txt");
        Path p4 = Paths.get("C:", "Users", "Gabriel", "Desktop", "JavaAprendendo", "src", "com/gabrielmaran/aprendendoClassesUtilitarias", "nio", "teste", "arquivo", "file.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
