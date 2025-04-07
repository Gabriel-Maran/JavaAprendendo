package com.gabrielmaran.aprendendoGenerics.teste;

import com.gabrielmaran.aprendendoGenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTeste01 {
    public static void main(String[] args) {
        List<Barco> barcos = List.of(new Barco("Yate"), new Barco("Canoqa"));
        List<List<Barco>> listBarco = criarArrayComUmObjeto(barcos);
        System.out.println(listBarco);
    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        return List.of(t);
    }
//    private static <T> void criarArrayComUmObjeto(T t){ //metodo sem retorno
//        System.out.println(List.of(t));
//    }
}

