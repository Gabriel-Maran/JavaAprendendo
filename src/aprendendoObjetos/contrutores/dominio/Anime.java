package aprendendoObjetos.contrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    public Anime(String nome, String tipo, int episodios, String genero) {
        //Esse é o contrututor, tudo que estiver nele, tem que obrigatoriamente ser fornecido na criação do objeto
        //Mesmo que você não crie um cosntrutor, o java cria um para vc na hora da execução, sem nada dentro dele
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio) {
        //Como visto em sobrecarga de metodos, é possivel ter dois contrutores iguais de nome, sendo chamado isso de sobrecarga de contrutores
        //Um requerindo algumas as informaçãoes e o outro todas, por exemplo
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }

    public Anime(){
    }

    public void immprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Episodios: "+this.episodios);
        System.out.println("Genero: "+this.genero);
        System.out.println("Estudio: "+this.estudio);
        System.out.println("------------------------");
    }

    // Outro metodo, ao inves de usar o init, podemos fazer cada get e set separado
    //    public void setTipo(String tipo){
    //        this.tipo = tipo;
    //    }
    //    public void setEposodios(int espisodios){
    //        this.episodios = espisodios;
    //    }
    //    public String getTipo(){
    //        return this.tipo;
    //    }
    //    public int getEpisodios(){
    //        return this.episodios;
    //    }
    //    public void setNome(String nome){
    //        this.nome = nome;
    //    }
    //    public String getNome(){
    //        return this.nome;
    //    }
    //
    //    public String getGenero() {
    //        return genero;
    //    }
    //
    //    public void setGenero(String genero) {
    //        this.genero = genero;
    //    }
}
