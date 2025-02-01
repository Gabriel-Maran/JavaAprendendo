package aprendendoClassesUtilitarias.nio.teste;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class FindAllTesteJavaOrClass extends SimpleFileVisitor<Path> {
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*Test*.{java,class}");
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(matcher.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTeste02 {
    public static void main(String[] args) throws IOException {
//        .java ou .class
        Path root = Paths.get(".");
        Files.walkFileTree(root, new FindAllTesteJavaOrClass());
    }
}
