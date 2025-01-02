package aprendendoExcecoes.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo(){
        File file = new File("src/aprendendoExcecoes/exception/arquivo\\teste.txt");
        //Se for proibido a criação de arquivos dentro daquela pasta ou local, não será possivel criar e vai dar o IOException de acesso negado
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado com sucesso!");
        }catch(IOException exception){//ao inves de "exception" pode se escrever "e" e "ex"
            //Nunca deixar esse bloco em branco
            exception.printStackTrace();
        }
    }
}
