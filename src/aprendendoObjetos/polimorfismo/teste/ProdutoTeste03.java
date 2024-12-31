package aprendendoObjetos.polimorfismo.teste;

import aprendendoObjetos.polimorfismo.dominio.Computador;
import aprendendoObjetos.polimorfismo.dominio.Produto;
import aprendendoObjetos.polimorfismo.dominio.Televisao;
import aprendendoObjetos.polimorfismo.dominio.Tomate;
import aprendendoObjetos.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Computador computador1 = new Computador("Computador1", 12000);
        Tomate tomate1 = new Tomate("Tomate1", 10);
        tomate1.setDataValidade("31/12/2024");
        CalculadoraImposto.calcularImposto(computador1);
        CalculadoraImposto.calcularImposto(tomate1);
    }
}
