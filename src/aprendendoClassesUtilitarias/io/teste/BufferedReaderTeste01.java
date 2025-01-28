package aprendendoClassesUtilitarias.io.teste;

import java.io.*;

public class BufferedReaderTeste01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoClassesUtilitarias\\io\\arquivo\\file.txt");
        try (FileReader fr = new FileReader(file);
             BufferedReader br = new BufferedReader(fr)) {
            String linha;
            while ((linha = br.readLine()) != null) {
                    System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
