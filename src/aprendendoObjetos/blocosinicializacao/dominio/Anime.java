package aprendendoObjetos.blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    //Ordem seguida:
    //1- É alocado em espaço de memoria o objeto
    //2- Cada atributo de classe é criado com um valor default ou outro que foi passado
    //3- Bloco de inicialização é executado
    //4- Contrutor é executado
    {
        //Bloco de inicialização, ele sempre é inicializado antes dos contrutores e em todos os objetos
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios : this.episodios) {
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
