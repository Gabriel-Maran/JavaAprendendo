package aprendendoClassesUtilitarias.io.teste;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTeste01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoClassesUtilitarias\\io\\arquivo\\file.txt");
        try(FileReader fr = new FileReader(file)){
//            System.out.println(fr.read());//Representa o valor o primeiro caracter segundo a tabela ASCII
//            char[] in = new char[100];
//            fr.read(in);
//            for(char c : in){
//                System.out.print(c);
//            }
            int i;
            while((i = fr.read()) != -1){ //-1 ele retorna quando o arquivo acaba
                System.out.print((char) i); //Leitura do arquivo
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
