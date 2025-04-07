package com.gabrielmaran.aprendendoConcorrencia.teste;

import com.gabrielmaran.aprendendoConcorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFutureTeste02 {

    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPricesAsyncCompletableFuture(storeService);
    }

    private static void searchPricesAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        List<String> lojas = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        List<CompletableFuture<Double>> cfs = lojas.stream().map(storeService::getPricesAsyncCompletableFuture)
                .collect(Collectors.toList());
        List<Double> prices = cfs.stream().map(CompletableFuture::join).collect(Collectors.toList());
        System.out.println(prices);
        long end = System.currentTimeMillis();
        System.out.println("Time passed to search prices: " + (end - start));
    }
}
