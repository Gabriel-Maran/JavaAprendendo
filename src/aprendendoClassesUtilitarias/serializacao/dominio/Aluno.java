package aprendendoClassesUtilitarias.serializacao.dominio;

import java.io.Serializable;

public class Aluno implements Serializable {
    private Long Id;
    private String nome;
    private String password;

    public Aluno(Long id, String nome, String password) {
        Id = id;
        this.nome = nome;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
