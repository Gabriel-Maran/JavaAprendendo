package aprendendoObjetos.associacao.exercicio.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("---- Jogador ----");
        System.out.println("Jogador: " + this.nome);
        if(time == null) return;
        System.out.println("Time: "+ time.getNome());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
