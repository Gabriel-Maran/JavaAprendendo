package aprendendoClassesUtilitarias.nio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTeste01 {
    public static void main(String[] args) {
        String direotorioProjeto  = "home/gabriel/arquivo.txt";
        String arquivoTxt ="../arquivo.txt0";
        String arquivoTxt2 ="../../arquivo.txt0";
        String arquivoTxt3 ="../../../arquivo.txt0";
        Path path1 = Paths.get(direotorioProjeto, arquivoTxt);
        Path path2 = Paths.get(direotorioProjeto, arquivoTxt2);
        Path path3 = Paths.get(direotorioProjeto, arquivoTxt3);
        System.out.println(path1);
        System.out.println(path1.normalize());
        System.out.println(path2.normalize());
        System.out.println(path3.normalize());

        Path path4 = Paths.get("/home/./gabriel/./arquivo.txt");
        System.out.println(path4.normalize());

    }
}
