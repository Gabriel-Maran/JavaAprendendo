package aprendendoObjetos.sobrescrita.dominio;

public class Anime {
    private  String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    @Override //sobrescrita, sobre escreve outro metodo, o override garante que isso acontecerá
    public String toString() {
        //O que está aqui sobrescreve o metodo 'toString()' para essa classe
        return "Anime: "+this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
