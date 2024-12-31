package aprendendoObjetos.polimorfismo.teste;

import aprendendoObjetos.polimorfismo.dominio.Computador;
import aprendendoObjetos.polimorfismo.dominio.Tomate;
import aprendendoObjetos.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador1 = new Computador("Computador 1", 15000);
        Tomate tomate1 = new Tomate("Tomate 1", 8);
        CalculadoraImposto.calcularImposto(computador1);
        CalculadoraImposto.calcularImposto(tomate1);
    }
}
