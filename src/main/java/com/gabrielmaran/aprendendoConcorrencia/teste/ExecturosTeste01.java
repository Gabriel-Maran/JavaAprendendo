package com.gabrielmaran.aprendendoConcorrencia.teste;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class printer implements Runnable{
    private final int num;

    public printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s iniciou: %d%n",Thread.currentThread().getName(), num );
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            System.out.printf("Erro ao colocar a Thread %s para dormir", Thread.currentThread().getName());
            e.printStackTrace();
        }
        System.out.printf("%s finalizou%n",Thread.currentThread().getName());
    }
}

public class ExecturosTeste01 {
    public static void main(String[] args) {
//        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(new printer(1));
        executorService.execute(new printer(2));
        executorService.execute(new printer(3));
        executorService.execute(new printer(4));
        executorService.execute(new printer(5));
        executorService.execute(new printer(6));
        executorService.shutdown();
        System.out.println("Programa finalizado");//Executa antes, por causa da Thread main

        }
}
