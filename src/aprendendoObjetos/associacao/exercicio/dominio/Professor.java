package aprendendoObjetos.associacao.exercicio.dominio;

public class Professor {
    private String nome;
    private Seminario[] seminarios;

    public Professor(String nome, Seminario[] seminarios) {
        this(nome);
        this.seminarios = seminarios;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("--- Professor ---");
        System.out.println("Nome:" + getNome());
        if (this.seminarios == null) return;
        for (Seminario seminario : this.seminarios) {
            System.out.println("Seminario: " + seminario.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
