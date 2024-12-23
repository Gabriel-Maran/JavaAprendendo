package aprendendoObjetos.modificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    //Ordem seguida:
    //0- Bloco de inicialização é executado quando a JVM carregar a classe
    //1- É alocado em espaço de memoria o objeto
    //2- Cada atributo de classe é criado com um valor default ou outro que foi passado
    //3- Bloco de inicialização é executado
    //4- Contrutor é executado
    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        //Bloco de inicialização, ele sempre é inicializado antes dos contrutores e em todos os objetos
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }
    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático 1");
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios : Anime.episodios) {
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
