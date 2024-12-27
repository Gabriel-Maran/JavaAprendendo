package aprendendoObjetos.heranca.exercicio.dominio;

public class Caminhao extends Veiculo {
    private double capacidadeCargaTonel;
    private int numeroEixos;

    public Caminhao(String marca, String modelo, double capacidadeCargaTonel, int numeroEixos) {
        super(marca, modelo);
        this.capacidadeCargaTonel = capacidadeCargaTonel;
        this.numeroEixos = numeroEixos;
    }
    public Caminhao(String marca, String placa, String modelo, int capacidadeCargaTonel, int numeroEixos) {
        super(marca, modelo, placa);
        this.capacidadeCargaTonel = capacidadeCargaTonel;
        this.numeroEixos = numeroEixos;
    }

    public void imprime(){
        System.out.println("---- Caminhão -----");
        super.imprime();
        System.out.println("Capacidade Máxima(toneladas): " + this.capacidadeCargaTonel );
        System.out.println("Numero Eixos: " + this.numeroEixos );
        System.out.println("-------------------");

    }

    public double getCapacidadeCargaTonel() {
        return capacidadeCargaTonel;
    }

    public void setCapacidadeCargaTonel(double capacidadeCargaTonel) {
        this.capacidadeCargaTonel = capacidadeCargaTonel;
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }
}
