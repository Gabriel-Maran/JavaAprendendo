package exercicios.exs02.dominio;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private static final List<Veiculo> listaVeiculos = new ArrayList<>();
    private static final List<Cliente> listaClientes = new ArrayList<>();

    public static void adicionarVeiculo(Veiculo veiculo) {
        Locadora.listaVeiculos.add(veiculo);
    }

    public static void adicionarCliente(Cliente cliente) {
        Locadora.listaClientes.add(cliente);
    }

    public static void buscarVeiculoDisponivel(String modelo) {
        if (listaVeiculos.isEmpty()) {
            System.out.println("A lista de veiculos está vazia, não foi possivel realizar a busca");
            return;
        }
        for (Veiculo veiculo : Locadora.listaVeiculos) {
            if (veiculo.getModelo().equals(modelo)) {
                System.out.println(modelo + " está disponivel? " + veiculo.isDisponivel());
            }
        }
    }

    public static void gerarRelatorioVeiculos() {
        System.out.println("------ Lista ------");
        for (Veiculo veiculo : Locadora.listaVeiculos) {
            System.out.println(veiculo.toString());
        }
        System.out.println("-------------------");
    }

    public static void alugarVeiculo(Cliente cliente, Veiculo veiculo) {
        if (!listaClientes.contains(cliente)) {
            throw new IllegalArgumentException("Cliente não cadastrado!");
        }
        if (veiculo.isDisponivel()) {
            veiculo.setDisponivel(false);
            System.out.println(cliente.getNome() + " alugou o veiculo " + veiculo.getModelo());
            cliente.setVeiculos(veiculo);
        }
    }

    public static void devolverVeiuclo(Cliente cliente, Veiculo veiculo, int dias) {
        if (!veiculo.isDisponivel() && cliente.getVeiculos().contains(veiculo)) {
            veiculo.setDisponivel(true);
            System.out.println(cliente.getNome() + " devolveu o veiculo " + veiculo.getModelo());
            System.out.println(cliente.getNome() + " pagou o valor de " + veiculo.calcularCustoAluguel(dias) + " reais");
            cliente.removeVeiculo(veiculo);
        }
    }

    public static List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public static List<Cliente> getListaClientes() {
        return listaClientes;
    }
}
