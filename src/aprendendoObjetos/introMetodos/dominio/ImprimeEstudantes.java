package aprendendoObjetos.introMetodos.dominio;

public class ImprimeEstudantes {
    public void impressora(Estudante estudante) {
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("-------------");
        estudante.nome = "Cleiton";//exemplo de má patrica
    }
}
