package com.gabrielmaran.aprendendoConcorrencia.teste;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int count = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < count; i++) {
            System.out.printf("%s executando uma tarefa callable...%n", Thread.currentThread().getName());
        }
        return count;
    }
}

public class CallableTeste01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCallable callable = new RandomNumberCallable();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> future = executor.submit(callable);
        Integer result = future.get();
        System.out.println("Prgram finished "+result);
        executor.shutdown();
    }
}
