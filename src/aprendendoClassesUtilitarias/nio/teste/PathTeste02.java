package aprendendoClassesUtilitarias.nio.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTeste02 {
    public static void main(String[] args) {
        Path arquivoPath = Paths.get("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoClassesUtilitarias\\nio\\teste\\arquivo");
        if(Files.notExists(arquivoPath)) {
            try {
                Path pastaDirectory = Files.createDirectory(arquivoPath);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Problema na criação do diretorio");
            }
        }

        Path subPastaPath = Paths.get("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoClassesUtilitarias\\nio\\teste\\arquivo\\subpasta");
        try {
            Files.createDirectories(subPastaPath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Problema na criação dos diretorios");
        }

        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if(Files.notExists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Problema na criação do arquivo");
            }
        }

        Path target = Paths.get(filePath.getParent().toString(), "filerenamed.txt");
        try {
            Files.copy(filePath, target, StandardCopyOption.REPLACE_EXISTING); //Arquivo copiado; caminho e nome do novo arquivo; replace caso ja exista um igual
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Problema na renomeação do arquivo");
        }
    }
}
