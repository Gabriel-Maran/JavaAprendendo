package com.gabrielmaran.aprendendoGenerics.teste;

import com.gabrielmaran.aprendendoColecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        for(String str : lista){
            System.out.println(str);
        }
        add(lista, new Consumidor("C"));
//        List lista = new ArrayList();
//        lista.add("A");
//        lista.add(new Consumidor("B"));
//        for(Object o : lista) {
//            if(o instanceof Consumidor) {
//                Consumidor c = (Consumidor) o;
//                System.out.println(o);
//            }
//            if(o instanceof String) {
//                System.out.println((String)o);
//            }
//        }
    }
    private static void add(List lista, Consumidor consumidor){// List<String> lista (com generics, para garantir que o valor será uma String)
        lista.add(consumidor);
    }
}
