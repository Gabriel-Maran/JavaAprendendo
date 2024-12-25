package aprendendoObjetos.associacao.exercicio.dominio;

public class Clube {
    private String nome;
    private Atleta[] atletas;

    public Clube(String nome, Atleta[] atletas) {
        this(nome);
        this.atletas = atletas;
    }

    public Clube(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("--- Clube ---");
        System.out.println("Nome: " + this.nome);
        if (atletas == null) {System.out.println("--------------"); return;}
        for (Atleta atleta : atletas) {
            System.out.println("Atleta: " + atleta.getNome());
        }
        System.out.println("--------------");
    }

    public Atleta[] getAtletas() {
        return atletas;
    }

    public void setAtletas(Atleta[] atletas) {
        this.atletas = atletas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void removeAtleta(Atleta atleta) {
        for (int i = 0; i < atletas.length; i++) {
            if (atletas[i].equals(atleta)) {
                atletas[i] = null;
            }
        }
    }
}
