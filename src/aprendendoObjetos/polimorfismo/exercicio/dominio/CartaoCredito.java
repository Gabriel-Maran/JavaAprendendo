package aprendendoObjetos.polimorfismo.exercicio.dominio;

public class CartaoCredito implements Pagamento {
    private String quatroUltimosNumeros;

    public CartaoCredito(String quatroUltimosNumerosCartao) {
        this.quatroUltimosNumeros = quatroUltimosNumerosCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        if(valor <= 0 ){
            System.out.println("Erro, o valor do pagamento tem que ser maior que zero");
            return;
        }
        System.out.println("Pagamento realizado com cartão de crédito");
    }

    @Override
    public void getComprovante() {
        System.out.println( "Comprovante de pagamento: " + quatroUltimosNumeros);
    }

    public String getQuatroUltimosNumerosCartao() {
        return quatroUltimosNumeros;
    }

}
