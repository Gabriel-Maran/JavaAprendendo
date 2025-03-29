package aprendendoConcorrencia.teste;

import aprendendoConcorrencia.service.StoreService;
import aprendendoConcorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTeste03 {

    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPricesAsyncCompletableFuture(storeServiceDeprecated);
    }

    private static void searchPricesAsyncCompletableFuture(StoreServiceDeprecated storeServiceDeprecated) {
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10, r ->{
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });
        List<String> lojas = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        List<CompletableFuture<Double>> completableFutureList = lojas.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeServiceDeprecated.getPriceSync(s),executorService))
                .toList();
        List<Double> listPrices = completableFutureList.stream().map(CompletableFuture::join).toList();
        System.out.println(listPrices);
        long end = System.currentTimeMillis();
        System.out.println("Time passed to search prices: " + (end - start) + "ms");
        executorService.shutdown();
    }
}
