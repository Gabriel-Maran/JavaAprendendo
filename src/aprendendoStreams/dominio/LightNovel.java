package aprendendoStreams.dominio;

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

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
