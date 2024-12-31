package aprendendoObjetos.polimorfismo.teste;

import aprendendoObjetos.polimorfismo.repositorio.Repositorio;
import aprendendoObjetos.polimorfismo.servico.RepositorioArquivo;
import aprendendoObjetos.polimorfismo.servico.RepositorioBancoDeDados;
import aprendendoObjetos.polimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
        repositorio = new RepositorioArquivo();
        repositorio.salvar();
        repositorio = new RepositorioMemoria();
        repositorio.salvar();

    }
}
