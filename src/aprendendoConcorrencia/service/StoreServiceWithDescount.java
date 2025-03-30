package aprendendoConcorrencia.service;

import aprendendoConcorrencia.dominio.Discount;
import aprendendoConcorrencia.dominio.Quote;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDescount {
    private static final ExecutorService ex = Executors.newCachedThreadPool();

    private double priceGenerator() {
        delay();
        return ThreadLocalRandom.current().nextDouble(1, 500) * 10;
    }

    public String getPriceSync(String storeName) {
        double price = priceGenerator();
        Discount.Code discountCode = Discount.Code.values()[
                ThreadLocalRandom.current().nextInt(Discount.Code.values().length)
                ];
        return String.format(Locale.US, "%s:%.2f:%s", storeName, price, discountCode);
    }

    public String applyDiscountSync(Quote quote) {
        delay();
        double discountValue = quote.getPrice() * (100-quote.getDiscount().getPercentage())/100;
        return String.format("'%s' original price: '%.2f'. Applying discount code '%s'. Final price: '%.2f'"
                , quote.getStore(), quote.getPrice(), quote.getDiscount(), discountValue);
    }

    public void shutdown() {
        ex.shutdown();
    }

    private void delay() {
        try {
            int milli = ThreadLocalRandom.current().nextInt(1, 5);
            TimeUnit.SECONDS.sleep(milli);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
