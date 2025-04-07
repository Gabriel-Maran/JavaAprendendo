package com.gabrielmaran.aprendendoObjetos.contrutores.exercicio.dominio;

public class Filme {
    private String titulo;
    private String diretor;
    private String genero;
    private int duracaoMinutos;
    private int anoLancamento;

    public Filme(String titulo, String diretor, String genero, int duracaoMinutos, int anoLancamento) {
        this(titulo, diretor, genero);
        this.duracaoMinutos = Math.max(duracaoMinutos, 0);
        this.anoLancamento = Math.max(anoLancamento, 0);
        //Math.max(var,minimo possivel) - isso garante que o numero a direita seja o menos valor possivel dentro dessa variavel
    }

    public Filme(String titulo, String diretor, String genero) {
        this();
        this.titulo = titulo;
        this.diretor = diretor;
        this.genero = genero;
    }

    public Filme(){
        this.titulo = "Desconhecido";
        this.diretor = "Desconhecido";
        this.genero = "Indefinido";
        this.duracaoMinutos = 0;
        this.anoLancamento = 0;
    }

    public void imprime(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Diretor: " + this.diretor);
        System.out.println("Genero: " + this.genero);
        System.out.println("Duração(min): " + this.duracaoMinutos);
        System.out.println("Ano de lancamento: " + this.anoLancamento);
        System.out.println("----------------------------------");
    }
}
