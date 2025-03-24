package aprendendoConcorrencia.teste;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExectutorServiceTeste01 {
    private static final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    //"Como faço para execturar uma tarefa uma vez ao dia?"
    private static void beeper() {
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(formatter) + " beep");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
//        executorService.schedule(r, 5, TimeUnit.SECONDS);
//        ScheduledFuture<?> scheduledFuture = executorService.scheduleWithFixedDelay(r, 0, 5, TimeUnit.SECONDS); // Não conta o tempo continuamente, então, tempoTotal = tenpoDormido + Delay
        ScheduledFuture<?> scheduledFuture = executorService.scheduleAtFixedRate(r, 0, 5, TimeUnit.SECONDS); //Conta o tempo continuamente, mesmo dormindo
        executorService.schedule(() -> {
            System.out.println("Cancelando o scheduleWithFixedDelay");
            scheduledFuture.cancel(false);
            executorService.shutdown();
        }, 11, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        beeper();
    }
}
