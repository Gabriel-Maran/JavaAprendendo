package com.gabrielmaran.aprendendoObjetos.polimorfismo.exercicio.dominio;

public class Pix implements Pagamento{
    private String codTransacao;

    public Pix(String codTransacao) {
        this.codTransacao = codTransacao;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento realizado via PIX");
    }

    @Override
    public void getComprovante() {
        System.out.println( "Comprovante de pagamento: " + codTransacao);
    }

    public String getCodTransacao() {
        return codTransacao;
    }
}
