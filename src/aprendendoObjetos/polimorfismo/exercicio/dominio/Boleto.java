package aprendendoObjetos.polimorfismo.exercicio.dominio;

public class Boleto implements Pagamento {
    private String numBoleto;

    public Boleto(String numBoleto) {
        this.numBoleto = numBoleto;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento realizado via boleto");
    }

    @Override
    public void getComprovante() {
        System.out.println( "Comprovante de pagamento: " + numBoleto);
    }

    public String getNumBoleto() {
        return numBoleto;
    }

}
