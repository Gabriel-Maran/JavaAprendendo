package aprendendoClassesUtilitarias.io.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoClassesUtilitarias\\io\\arquivo\\file.txt");
        try (FileWriter fw = new FileWriter(file, true)){//a segunda opção(append) vai adicionar o que está no write e não deleta o que está dentro do arquivo
            fw.write("O Gabriel sabe muito, slk\nNão tem jeito\n");
            fw.flush(); //Coloca tudo no buffer, bascimente. Deve ser feito sempre
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
