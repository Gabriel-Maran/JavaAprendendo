package aprendendoClassesUtilitarias.io.teste;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;


public class FileTeste01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoClassesUtilitarias\\io\\arquivo\\file.txt");
        try {
            boolean isCreated = file.createNewFile();
            boolean existsFile = file.exists();
            System.out.println("Caminho: "+file.getPath());
            System.out.println("Diretorio: "+file.isDirectory());
            System.out.println("Arquivo: "+file.isFile());
            System.out.println("Escondido: "+file.isHidden());
            System.out.println("Ler: "+file.canRead());
            System.out.println("Escrever: "+file.canWrite());
            System.out.println("Criado: "+isCreated);
            System.out.println("Ultima modificalçao: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
            if(existsFile) {
                System.out.println("Deletado: "+file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
