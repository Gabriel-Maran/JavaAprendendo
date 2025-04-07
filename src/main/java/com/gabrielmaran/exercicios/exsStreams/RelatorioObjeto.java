package com.gabrielmaran.exercicios.exsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class RelatorioObjeto {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Notebook", "Eletrônicos", 3500.00),
                new Produto("Smartphone", "Eletrônicos", 2500.00),
                new Produto("Camiseta", "Vestuário", 79.90),
                new Produto("Calça Jeans", "Vestuário", 199.90),
                new Produto("Livro", "Cultura", 59.90)
        );

        List<RelatorioCategoria> relatorio = produtos.stream()
                .collect(Collectors.groupingBy(
                        Produto::getCategoria,
                        TreeMap::new, // Ordena por categoria (alfabético)
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> {
                                    long count = list.size();
                                    double media = list.stream()
                                            .mapToDouble(Produto::getPreco)
                                            .average()
                                            .orElse(0.0);
                                    return new RelatorioCategoria(
                                            list.get(0).getCategoria(),
                                            count,
                                            media
                                    );
                                }
                        )
                ))
                .values()
                .stream()
                .collect(Collectors.toList());

        // Exibir relatório
        relatorio.forEach(System.out::println);
    }
}

class Produto {
    private String nome;
    private String categoria;
    private double preco;

    // Construtor
    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    // Getters
    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " (" + categoria + ") - R$" + preco;
    }
}

class RelatorioCategoria {
    private String categoria;
    private long quantidade;
    private double precoMedio;

    // Construtor
    public RelatorioCategoria(String categoria, long quantidade, double precoMedio) {
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.precoMedio = precoMedio;
    }

    @Override
    public String toString() {
        return String.format(
                "Categoria: %-10s | Itens: %2d | Preço Médio: R$%.2f",
                categoria, quantidade, precoMedio
        );
    }
}
