package aprendendoObjetos.associacao.exercicio.dominio;

public class Atleta {
    private String nome;
    private Clube clube;

    public Atleta(String nome, Clube clube) {
        this(nome);
        this.clube = clube;
    }

    public void imprime() {
        System.out.println("--- Atleta ---");
        System.out.println("Nome: " + nome);
        if (clube == null) {System.out.println("--------------"); return;}
        System.out.println("Clube: " + clube.getNome());
        System.out.println("--------------");
    }

    public Atleta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }

    public void removeClube() {
        this.clube = null;
    }
}
