package com.gabrielmaran.aprendendoObjetos.heranca.exercicio.dominio;

public class Carro extends Veiculo{
    private int numeroPortas;
    private boolean automatico;

    public Carro(String marca, String modelo, int numeroPortas, boolean automatico) {
        super(marca, modelo);
        this.numeroPortas = numeroPortas;
        this.automatico = automatico;
    }
    public Carro(String marca, String placa, String modelo, int numeroPortas, boolean automatico) {
        super(marca, modelo, placa);
        this.numeroPortas = numeroPortas;
        this.automatico = automatico;
    }

    public void imprime(){
        System.out.println("---- Carro -----");
        super.imprime();
        System.out.println("Numero de Portas: " + numeroPortas);
        System.out.println("Automatico? " + (automatico? "Sim" : "Não"));
        System.out.println("----------------");
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
}
