package aprendendoObjetos.associacao.exercicio.dominio;

public class Estudante {
    private String nome;
    private Seminario seminario;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public Estudante(String nome, Seminario seminario) {
        this(nome);
        this.seminario = seminario;
    }

    public void imprime() {
        System.out.println("--- Estudante ---");
        System.out.println("Nome: " + getNome());
        if (seminario == null) return;
            System.out.println("Seminario: " + seminario.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
