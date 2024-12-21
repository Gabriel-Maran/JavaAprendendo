package aprendendoObjetos.contrutores.exercicio.teste;

import aprendendoObjetos.contrutores.exercicio.dominio.Filme;

public class FilmeTeste01 {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Titulo1", "Diretor1", "Genero1", 120, 2000);
        Filme filme2 = new Filme("Titulo2", "Diretor2", "Genero2");
        Filme filme3 = new Filme();
        filme1.imprime();
        filme2.imprime();
        filme3.imprime();
    }
}
