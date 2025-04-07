package com.gabrielmaran.aprendendoObjetos.modifcadorfiinal.dominio;

public class Carro { //Classe final, ninguém pode herdar
    private String nome;
    public static final double VELOCIDADE_LIMITE; //public static final double VELOCIDADE_LIMITE = 250;
    //final = variavel NÃO pode ser alterado seu valor, deve ser escrita em CAPSLOCK e com espaçamento entre as palavras (_).
    //o 'final' deve ter um valor, deve ser informado
    public final Comprador COMPRADOR = new Comprador(); //Não pode alterar a referencia para o objeto

    static {
        VELOCIDADE_LIMITE = 250;
    }

    public final void imprime() { //metodo final = não pode ser sobrescrito. "Esse comportamento tem que ter para todos"
        System.out.println("Nome: " + this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
