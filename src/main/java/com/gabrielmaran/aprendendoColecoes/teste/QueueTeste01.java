package com.gabrielmaran.aprendendoColecoes.teste;

import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTeste01 {
    public static void main(String[] args) {
        Queue<String> stringQueue = new PriorityQueue<>();
        stringQueue.add("C");
        stringQueue.add("A");
        stringQueue.add("B");

//        System.out.println(stringQueue.peek()); //pega o primeiro elemento da fila
//        System.out.println(stringQueue.poll()); //pega o primeiro elemento da fila e remove (mesma coisa que o remove vazio)
//        System.out.println(stringQueue.peek());

        while(!stringQueue.isEmpty()) {
            System.out.println(stringQueue.poll());
        }
        System.out.println(stringQueue);
    }
}
