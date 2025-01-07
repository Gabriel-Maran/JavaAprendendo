package aprendendoExcecoes.exception.teste;

import java.io.File;
import java.io.IOException;

public class ExceptionTeste02 {
    public static void main(String[] args) throws IOException  {
        try{
            criarNovoArquivo();
        } catch(IOException e){
            e.printStackTrace();
        }
    }



    public static void criarNovoArquivo() throws IOException {
        File file = new File("src/aprendendoExcecoes/exception/arquivo\\teste.txt");
        //Se for proibido a criação de arquivos dentro daquela pasta ou local, não será possivel criar e vai dar o IOException de acesso negado
        try{
            boolean isCriado = file.createNewFile(); //V ou F
            System.out.println("Arquivo criado com sucesso!");
        }catch(IOException exception){//ao inves de "exception" pode se escrever "e" e "ex"
            //Nunca deixar esse bloco em branco, pois se deixar em branco, não saberá qual foi o problema
            exception.printStackTrace();
            // throw new RuntimeException("Problema na hora de criar o arquivo"); // Outro metodo, indo de exception em exception
            throw exception; //Relança a exceção
        } //Pode ser adicionado o bloco finally para executar, mesmo se o catch não ser executado, o finally será
    }
}
