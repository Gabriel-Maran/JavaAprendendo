package com.gabrielmaran.aprendendoObjetos.heranca.exercicio.dominio;

public class Moto extends Veiculo {
    private int cilindrada;
    private boolean partidaEletrica;

    public Moto(String marca, String modelo, int cilindrada, boolean partidaEletrica) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
        this.partidaEletrica = partidaEletrica;
    }
    public Moto(String marca, String placa, String modelo, int cilindrada, boolean partidaEletrica) {
        super(marca, modelo, placa);
        this.cilindrada = cilindrada;
        this.partidaEletrica = partidaEletrica;
    }

    public void imprime(){
        System.out.println("---- Moto -----");
        super.imprime();
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Partida Elétrica? " + (partidaEletrica? "Sim" : "Não"));
        System.out.println("---------------");
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }
}
