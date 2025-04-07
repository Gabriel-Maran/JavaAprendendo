package com.gabrielmaran.aprendendoObjetos.modifcadorfiinal.teste;

import com.gabrielmaran.aprendendoObjetos.modifcadorfiinal.dominio.Carro;
import com.gabrielmaran.aprendendoObjetos.modifcadorfiinal.dominio.Comprador;
import com.gabrielmaran.aprendendoObjetos.modifcadorfiinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Comprador comprador1 = new Comprador();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro1.COMPRADOR);
        carro1.COMPRADOR.setNome("Cleiton");
        System.out.println(carro1.COMPRADOR);

        Ferrari ferrari1 = new Ferrari();
        ferrari1.setNome("Ferrari1");
        ferrari1.imprime();
    }
}
