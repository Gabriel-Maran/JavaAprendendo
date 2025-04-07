package com.gabrielmaran.aprendendoClassesUtilitarias.nio.teste;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTeste01 {
    public static void main(String[] args) {
        Path path = Paths.get(".");//O ponto referencia tudo do diretorio atual, sendo o JavaAprendendo
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
            for(Path p : stream){
                System.out.println(p.getFileName());
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
