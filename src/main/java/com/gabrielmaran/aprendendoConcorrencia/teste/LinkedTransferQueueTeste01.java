package com.gabrielmaran.aprendendoConcorrencia.teste;

import java.util.concurrent.*;

public class LinkedTransferQueueTeste01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        TransferQueue<Object> tq2 = new LinkedTransferQueue<>();
        System.out.println(tq.add("Gabriel1"));//True ou exceção
        System.out.println(tq.add("Gabriel2"));
        System.out.println(tq.add("Gabriel3"));
        System.out.println(tq.offer("Gabriel4", 10, TimeUnit.SECONDS));//True ou False, espera 10 segundos até uma casa ficar livre        tq.put("Gabriel");//Insere o elemento e espera se nn der, ate que possa colocar o elemento
        if(tq.hasWaitingConsumer()){
            tq.transfer("Gabriel5");//Espera algo consumir o elemento que ele está tentando transferir
        }
        System.out.println(tq.tryTransfer("Gabriel6"));
        System.out.println(tq.tryTransfer("Gabriel7", 2, TimeUnit.SECONDS));
        if(!tq.isEmpty()){
            System.out.println(tq.element()); //epga o primeiro elemento e o retorna, se estiver vazio, retonra uma exceção
        }
        System.out.println(tq2.peek()); //pega o primeiro elemento e o retorna, se estiver vazio, retonra null
        System.out.println(tq.peek());//Mostra qual é o primeiro elemento da fila, se vazio, exceção
        System.out.println(tq.poll());//Pega o primeiro elemento da fila e o remove, se vazio, null
        System.out.println(tq.take());//Pega o primeiro elemento da fila e espera alguem colocar um valor no lugar do que foi retirado
        System.out.println(tq.remainingCapacity() + " de capacidade");

    }
}
