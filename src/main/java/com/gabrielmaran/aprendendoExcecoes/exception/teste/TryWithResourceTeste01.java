package com.gabrielmaran.aprendendoExcecoes.exception.teste;

import com.gabrielmaran.aprendendoExcecoes.exception.dominio.Leitor01;
import com.gabrielmaran.aprendendoExcecoes.exception.dominio.Leitor02;

import java.io.*;

public class TryWithResourceTeste01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    // melhor jeito
    public static void lerArquivo() {
        try (Leitor01 leitor01 = new Leitor01();
             Leitor02 leitor02 = new Leitor02()) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // jeito 2
    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
