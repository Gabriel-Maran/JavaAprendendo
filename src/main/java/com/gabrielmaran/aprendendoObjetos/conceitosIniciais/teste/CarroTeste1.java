package com.gabrielmaran.aprendendoObjetos.conceitosIniciais.teste;

import com.gabrielmaran.aprendendoObjetos.conceitosIniciais.dominio.Carro;

public class CarroTeste1 {
    public static void main(String[] args) {
        //Criação de objetos
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();
        Carro carro03 = new Carro();
        //Dando valores ao objeto "carro01"
        carro01.nome = "Carro01";
        carro01.ano = "2006";
        carro01.modelo = "Modelo01";
        //Dando valores ao objeto "carro02"
        carro02.nome = "Carro02";
        carro02.ano = "2010";
        carro02.modelo = "Modelo02";
        //Dando os valores ao objeto "carro03"
        carro03 = carro01;
        //Aprensentando suas informações
        System.out.println("O carro " + carro01.nome + " é de " + carro01.ano + " e o seu modelo é " + carro01.modelo);
        System.out.println("O carro " + carro02.nome + " é de " + carro02.ano + " e o seu modelo é " + carro02.modelo);
        System.out.println("O carro " + carro03.nome + " é de " + carro03.ano + " e o seu modelo é " + carro03.modelo);
    }
}
