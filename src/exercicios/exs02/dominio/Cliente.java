package exercicios.exs02.dominio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private final String nome;
    private final String cpf;
    List<Veiculo> veiculos = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void removeVeiculo(Veiculo veiculo) {
        veiculos.remove(veiculo);
    }
}
