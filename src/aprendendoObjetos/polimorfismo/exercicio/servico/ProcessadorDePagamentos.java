package aprendendoObjetos.polimorfismo.exercicio.servico;

import aprendendoObjetos.polimorfismo.exercicio.dominio.CartaoCredito;
import aprendendoObjetos.polimorfismo.exercicio.dominio.Pagamento;

public class ProcessadorDePagamentos {
    public static void executarPagamento(Pagamento pagamento, double valor) {
        //pegando o objeto masi generico possivel, pq pode ser usado como base e evita repetiçã
        System.out.println("--- Informações do pagamento ---");
        System.out.println("Valor: R$" + valor);
        pagamento.processarPagamento(valor);
        pagamento.getComprovante();
    }
}
