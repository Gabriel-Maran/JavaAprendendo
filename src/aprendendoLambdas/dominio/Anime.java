package aprendendoLambdas.dominio;

public class Anime {
    private String nome;
    private int episodios;

    public Anime(String nome, int quantidade) {
        this.nome = nome;
        this.episodios = quantidade;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                ", episodios=" + episodios +
                '}';
    }

    public int getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
