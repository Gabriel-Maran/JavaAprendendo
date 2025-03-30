package aprendendoConcorrencia.teste;

import aprendendoConcorrencia.dominio.Quote;
import aprendendoConcorrencia.service.StoreServiceWithDescount;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureTeste05 {
    public static void main(String[] args) {
        StoreServiceWithDescount service = new StoreServiceWithDescount();
        searchPricesWithDiscountAsymc(service);
    }

    private static void searchPricesWithDiscountAsymc(StoreServiceWithDescount service) {
        long start = System.currentTimeMillis();
        List<String> lojas = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        var completableFutures = lojas.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSync(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscountSync(quote))))
                .toArray(CompletableFuture[]::new);

//        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures); //Para saber se todas as tarefas do CompletableFuture foram finalizadas
        CompletableFuture<Object> voidCompletableFuture = CompletableFuture.anyOf(completableFutures); //Para saber quando qualquer um dos CompletableFuture finalizar

        voidCompletableFuture.join();
        System.out.printf("Finished? %b%n",voidCompletableFuture.isDone());
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + "ms");
    }
}
