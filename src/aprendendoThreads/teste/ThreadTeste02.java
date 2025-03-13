package aprendendoThreads.teste;

class ThreadExampleRunnable2 implements Runnable {
    private final String s;

    public ThreadExampleRunnable2(String s) {
        this.s = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(s);
            if (i % 100 == 0) {
                System.out.println();
            }
            Thread.yield();// Da uma dica que deve dar um tempo, para o escalador
            try {
                Thread.sleep(111);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//Daemon X User
public class ThreadTeste02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
//        t1.join(); // Basicamente, enquanto a Thread 1(t1) não for completamente executada, ele não pode executar a próxima
        t2.start();



//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        });
//        Thread t1 = new Thread(() -> {
//
//        });
//        new Thread(() -> {
//
//        }).start();
//        Runnable example = () ->{
//
//        };
//        new Thread(example).start();
    }
}
