package com.gabrielmaran.aprendendoObjetos.contrutores.exercicio.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private int paginas;
    private String editora;

    public Livro(String titulo, String autor, int ano, int paginas, String editora) {
        this(titulo, autor, ano, paginas);
        this.editora = editora;
    }

    public Livro(String titulo, String autor, int ano, int paginas) {
        this();
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.paginas = paginas;
    }

    public Livro() {

    }

    public void imprime() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Paginas: " + this.paginas);
        System.out.println("Editora: " + this.editora);
        System.out.println("---------------------------");
    }

}
