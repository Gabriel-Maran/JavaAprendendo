package com.gabrielmaran.aprendendoObjetos.modificadorestatico.teste;

import com.gabrielmaran.aprendendoObjetos.modificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Nome1", 280);
        Carro carro2 = new Carro("Nome2", 300);
        Carro carro3 = new Carro("Nome3", 255);

        Carro.velocidadeLimite = 180;

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
