package aprendendoObjetos.enumeracao.exercicio.teste;

import aprendendoObjetos.enumeracao.exercicio.dominio.CategoriaProduto;
import aprendendoObjetos.enumeracao.exercicio.dominio.Produto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Produto[] produtos = {
            new Produto("Produto 1", 300, CategoriaProduto.ALIMENTOS),
            new Produto("Produto 2", 300, CategoriaProduto.ELETRONICOS),
            new Produto("Produto 3", 300, CategoriaProduto.ROUPAS),
            new Produto("Produto 4", 300, CategoriaProduto.OUTROS)
        };


        for(Produto produto : produtos){
            System.out.println(produto);
        }

        for(int i=0; i< CategoriaProduto.values().length; i++){
            CategoriaProduto categoria = CategoriaProduto.values()[i];
            System.out.println("Categoria pelo número "+(i+1)+": "+categoria);
        }


    }
}
