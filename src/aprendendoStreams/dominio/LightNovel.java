package aprendendoStreams.dominio;

import java.util.Objects;

public class LightNovel {
    private String nome;
    private double preco;

    public LightNovel(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightNovel that = (LightNovel) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
