package exercicios.exsStreams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapearObjetoID {
    public static void main(String[] args) {
        List<Pessoa> pessoas = List.of(
                new Pessoa(1, "Alice", 25),
                new Pessoa(2, "Bob", 30),
                new Pessoa(3, "Carlos", 22)
        );
        Set<Integer> listIdPessoas = pessoas.stream().map(Pessoa::getId).collect(Collectors.toSet());//Set evita IDs duplicados
        System.out.println(listIdPessoas);
    }
}

class Pessoa {
    private int id;
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    // Getters (necessários para acessar os campos)
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // toString() para impressão amigável
    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", idade=" + idade + "]";
    }
}
