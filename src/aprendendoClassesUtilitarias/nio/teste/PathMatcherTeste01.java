package aprendendoClassesUtilitarias.nio.teste;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTeste01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("home/gabriel/dev/arquivo.txt");
        Path path2 = Paths.get("home/subpasta1l/file.txt");
        Path path3 = Paths.get("home/subpastal/file.java");
        matches(path1, "glob:**/*.bkp");// /* ignora o diretorio para tras do arquivo, ** considera os diretorios, * não considera os diretorios
        matches(path2, "glob:**.txt");
        matches(path3, "glob:**.{java,txt,bkp}");// {} agrupamento para falar que quer verificar se tem mais de um tipo
        matches(path2, "glob:**/*.???");// ??? significa que você quer qualquer um que tenha a extensão com 3 letras
        matches(path2, "glob:**/file.???");// nome do arquivo = file e extensão com 3 letras
        matches(path3, "glob:home/subpastal/file.java");
    }
    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob +":"+matcher.matches(path));
    }
}
