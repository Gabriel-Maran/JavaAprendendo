package aprendendoObjetos.polimorfismo.servico;

import aprendendoObjetos.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salavando em um arquivos");
    }
}
