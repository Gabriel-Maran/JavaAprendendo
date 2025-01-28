package aprendendoClassesUtilitarias.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritterTeste01 {
    public static void main(String[] args) { //utilizada para otmização na parte da escrita, basicamente BufferedWriter > FileWritter, em questão de desempenho
        File file = new File("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoClassesUtilitarias\\io\\arquivo\\file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) { //a segunda opção(append) vai adicionar o que está no write e não deleta o que está dentro do arquivo
            bw.write("O Gabriel sabe muito, slk");
            bw.newLine();
            bw.write("Não tem jeito");
            bw.newLine();
            bw.flush(); //Coloca tudo no buffer, bascimente. Deve ser feito sempre
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
