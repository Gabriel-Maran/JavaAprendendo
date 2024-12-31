package aprendendoObjetos.polimorfismo.exercicio.dominio;

public interface Pagamento {
    public abstract void processarPagamento(double valor);
    public abstract void getComprovante();
}
