package aprendendoClassesUtilitarias.nio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTeste01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/gabriel");
        Path classe = Paths.get("/home/gabriel/slk/OlaMundo.java");
        Path pathToClasse = dir.relativize(classe);
        System.out.println(pathToClasse);

        Path absoluto1 = Paths.get("/home/gabriel");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/gabriel/slk/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.21039");

        System.out.println("1: "+absoluto1.relativize(absoluto3));
        System.out.println("2: "+absoluto3.relativize(absoluto1));// A resposta é voltar dois diretorios
        System.out.println("3: "+absoluto1.relativize(absoluto2));
        System.out.println("4: "+relativo1.relativize(relativo2));
//        System.out.println("5: "+absoluto1.relativize(relativo1)); // Da erro e o Java não sabe localizar o arquivo, pois falta informação

    }
}
