package aprendendoClassesUtilitarias.nio.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTeste01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("home/teste.txt");
        if (Files.notExists(path)) {
            Files.createFile(path);
        }
//        Files.setAttribute(path, "dos:hidden", false);
//        Files.setAttribute(path, "dos:readonly", false);
        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println("Hidden: " + dosFileAttributes.isHidden());
        System.out.println("Read Only:" + dosFileAttributes.isReadOnly());
        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        fileAttributeView.setHidden(true);
        fileAttributeView.setReadOnly(true);
        System.out.println("Hidden: " + fileAttributeView.readAttributes().isHidden());
        System.out.println("Read Only:" + fileAttributeView.readAttributes().isReadOnly());

    }
}
