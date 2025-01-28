package aprendendoClassesUtilitarias.io.teste;

import java.io.File;
import java.io.IOException;

public class FileTeste02 {
    public static void main(String[] args) {
        File fileDiretorio = new File("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoClassesUtilitarias\\io\\teste\\pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println("Diretorio criado: "+isDiretorioCriado);

//        File fileArquivoDiretorio = new File("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoClassesUtilitarias\\io\\arquivo\\pasta\\file2.txt");
        File fileArquivoDiretorio = new File(fileDiretorio,"file2.txt");
        try {
            boolean isFileCreated = fileArquivoDiretorio.createNewFile();
            System.out.println("Arquivo criado: "+isFileCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamedArquivo = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo renomeado: "+isRenamedArquivo);

        File diretorioRenamed = new File("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoClassesUtilitarias\\io\\teste\\pasta02");
        boolean isRenamedDiretorio = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio renomeado: "+isRenamedDiretorio);
    }
}
