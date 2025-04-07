package com.gabrielmaran.aprendendoConcorrencia.teste;

import com.gabrielmaran.aprendendoConcorrencia.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTeste01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
//        searchPriceSync(storeService);
//        searchPricesAsyncFuture(storeService);
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPriceSync(StoreService storeService) {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.println("Time passed to search prices: " + (end - start));
    }

    private static void searchPricesAsyncFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        Future<Double> pricesAsync1 = storeService.getPricesAsync("Store 1");
        Future<Double> pricesAsync2 = storeService.getPricesAsync("Store 2");
        Future<Double> pricesAsync3 = storeService.getPricesAsync("Store 3");
        Future<Double> pricesAsync4 = storeService.getPricesAsync("Store 4");
        try {
            System.out.println(pricesAsync1.get());
            System.out.println(pricesAsync2.get());
            System.out.println(pricesAsync3.get());
            System.out.println(pricesAsync4.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time passed to search prices: " + (end - start));
        storeService.shutdown();
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAsync1 = storeService.getPricesAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> pricesAsync2 = storeService.getPricesAsyncCompletableFuture("Store 2");
        CompletableFuture<Double> pricesAsync3 = storeService.getPricesAsyncCompletableFuture("Store 3");
        CompletableFuture<Double> pricesAsync4 = storeService.getPricesAsyncCompletableFuture("Store 4");

        System.out.println(pricesAsync1.join());
        System.out.println(pricesAsync2.join());
        System.out.println(pricesAsync3.join());
        System.out.println(pricesAsync4.join());
        long end = System.currentTimeMillis();
        System.out.println("Time passed to search prices: " + (end - start));
    }
}
