package aprendendoObjetos.polimorfismo.servico;

import aprendendoObjetos.polimorfismo.dominio.Computador;
import aprendendoObjetos.polimorfismo.dominio.Produto;
import aprendendoObjetos.polimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("--- Relátorio de imppposto ---");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        System.out.println("Valor total a ser pago: " + (imposto + produto.getValor()));
        if (produto instanceof Tomate) {
            // Uma forma de fazer
            // Tomate tomate = (Tomate) produto;
            // System.out.println("Data de validade: "+tomate.getDataValidade());
            //--------------------
            // Outra forma
            String dataValidade = ((Tomate)produto).getDataValidade();
            System.out.println("Data de validade: "+ dataValidade);
        }
        System.out.println("-------------------------------");

    }
}
