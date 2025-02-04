package aprendendoClassesUtilitarias.serializacao.teste;

import aprendendoClassesUtilitarias.serializacao.dominio.Aluno;
import aprendendoClassesUtilitarias.serializacao.dominio.Turma;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerealizacaoTeste01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Gabriel", "abc123");
        Turma turma = new Turma("NãoSeSabe");
        aluno.setTurma(turma);
        serelaizar(aluno);
        deserelaizar();
    }
    private static void serelaizar(Aluno aluno) {
        Path path = Paths.get("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoClassesUtilitarias\\serializacao\\pasta\\aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deserelaizar() {
        Path path = Paths.get("C:\\Users\\Gabriel\\Desktop\\JavaAprendendo\\src\\aprendendoClassesUtilitarias\\serializacao\\pasta\\aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e ) {
            e.printStackTrace();
        }
    }
}
