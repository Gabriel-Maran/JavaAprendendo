package com.gabrielmaran.aprendendoColecoes.teste;

import com.gabrielmaran.aprendendoColecoes.dominio.Consumidor;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class ConsumidorComparator implements Comparator<Consumidor> {

    @Override
    public int compare(Consumidor o1, Consumidor o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class QueueTeste02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("A");
        Consumidor consumidor2 = new Consumidor("B");
        Consumidor consumidor3 = new Consumidor("D");
        Consumidor consumidor4 = new Consumidor("F");
        Consumidor consumidor5 = new Consumidor("J");
        Queue<Consumidor> queue = new PriorityQueue<>(new ConsumidorComparator()); //Pode ser usado comparable na classe Consumidor tambem
        queue.add(consumidor1);
        queue.add(consumidor2);
        queue.add(consumidor3);
        queue.add(consumidor4);
        queue.add(consumidor5);
        for(Consumidor consumidor : queue) {
            System.out.println(consumidor.getNome() + " - " + consumidor.getId());
        }
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
        System.out.println(queue);
    }
}
