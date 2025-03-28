package aprendendoConcorrencia.service;

import java.util.concurrent.*;

public class StoreService {
    private static final ExecutorService ex = Executors.newCachedThreadPool();
    private double priceGenerator(){
        System.out.printf("%s, generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextDouble(1,500)*10;
    }

    public Future<Double> getPricesAsync(String storeName){
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return ex.submit(this::priceGenerator);
    }

    public CompletableFuture<Double> getPricesAsyncCompletableFuture(String storeName){
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);
    }

    public void shutdown(){
        ex.shutdown();
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public double getPriceSync(String storeName){
        System.out.printf("Getting prices sync for store %s%n", storeName);
        return priceGenerator();
    }

}
