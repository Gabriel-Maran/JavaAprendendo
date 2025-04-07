package com.gabrielmaran.exercicios.exs03.teste;

import com.gabrielmaran.exercicios.exs03.dominio.Circulo;
import com.gabrielmaran.exercicios.exs03.dominio.Forma;
import com.gabrielmaran.exercicios.exs03.dominio.Retangulo;
import com.gabrielmaran.exercicios.exs03.dominio.TipoForma;
import com.gabrielmaran.exercicios.exs03.service.RepositorioForma;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FormasTeste01 {
    public static void main(String[] args) {
        RepositorioForma<Forma> repositorio = new RepositorioForma<>();
        try {
            List<String> linhas = Files.readAllLines(Path.of("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\exercicios\\exs03\\teste\\fomas.txt"));
            linhas.forEach(linha -> {
                String[] partes = linha.split(",");
                TipoForma tipo = TipoForma.valueOf(partes[0].toUpperCase());
                switch (tipo) {
                    case CIRCULO -> {
                        double raio = Double.parseDouble(partes[1]);
                        repositorio.addForma(new Circulo(raio));
                    }
                    case RETANGULO -> {
                        double altura = Double.parseDouble(partes[1]);
                        double largura = Double.parseDouble(partes[2]);
                        repositorio.addForma(new Retangulo(altura, largura));
                    }
                    default -> {
                        System.out.println("Tipo desconhecido: " + tipo);
                    }
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(repositorio.getLista());
        repositorio.printListaFormas();

    }
}
