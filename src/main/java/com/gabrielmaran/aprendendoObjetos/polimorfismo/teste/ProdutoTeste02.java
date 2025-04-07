package com.gabrielmaran.aprendendoObjetos.polimorfismo.teste;

import com.gabrielmaran.aprendendoObjetos.polimorfismo.dominio.Computador;
import com.gabrielmaran.aprendendoObjetos.polimorfismo.dominio.Produto;
import com.gabrielmaran.aprendendoObjetos.polimorfismo.dominio.Televisao;
import com.gabrielmaran.aprendendoObjetos.polimorfismo.dominio.Tomate;
import com.gabrielmaran.aprendendoObjetos.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        // variavel de referencia 'nome' = new objeto que recebe('valores')
        // tipo generico faz referencia a um objeto mais especfico
        Produto computador1 = new Computador("Computador1", 12000);
        Produto tomate1 = new Tomate("Tomate1", 10);
        Televisao tv1 = new Televisao("Televisão 50\"", 5500);
        CalculadoraImposto.calcularImposto(computador1);
        CalculadoraImposto.calcularImposto(tomate1);
        CalculadoraImposto.calcularImposto(tv1);

    }
}
