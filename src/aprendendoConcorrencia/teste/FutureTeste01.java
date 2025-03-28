package aprendendoConcorrencia.teste;

import java.util.concurrent.*;

public class FutureTeste01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollar = executorService.submit(new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                TimeUnit.SECONDS.sleep(2);
                return 4.36D;
            }
        });
        System.out.println(doSomething());
        try {
            System.out.println("Dollar: "+dollar.get(3, TimeUnit.SECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new RuntimeException("Erro ao pegar o valor ");
        }finally {
            executorService.shutdown();
        }
    }

    private static long doSomething() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }
}
