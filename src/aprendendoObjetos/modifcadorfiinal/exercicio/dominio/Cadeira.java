package aprendendoObjetos.modifcadorfiinal.exercicio.dominio;

public final class Cadeira {
    private final String MARCA = "Genérica";
    private String cor;

    public Cadeira(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Cadeira{" +
                "MARCA='" + this.MARCA + '\'' +
                ", cor='" + this.cor + '\'' +
                '}';
    }

    public void informacoes(){
        System.out.println("---- Informações da Cadeira ----");
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.MARCA);
        System.out.println("--------------------------------");
    }

    public void alterarCor(String cor){
        this.cor = cor;
    }

    public String getMARCA() {
        return MARCA;
    }

    public String getCor() {
        return cor;
    }
}
