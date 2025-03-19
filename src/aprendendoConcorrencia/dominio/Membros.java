package aprendendoConcorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Membros {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }
    }

    public void addMemberEmail(String email) {
        lock.lock();
        try {
            String nameThread = Thread.currentThread().getName();
            System.out.println(nameThread + " adicionou email a lista");
            this.emails.add(email);
            condition.signalAll();//Avisa todas as Threads, igual o notifyAll
        } finally {
            lock.unlock();
        }

    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        lock.lock();
        try {
            while (emails.isEmpty()) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " não tem  email dispovinel na lista, entrando em modo de espera");
                condition.await();//Diz para escperar, igual o Wait
            }
            return this.emails.poll();
        } finally {
            lock.unlock();
        }
    }

    public void close() {
        lock.lock();
        try {
            open = false;
            System.out.println(Thread.currentThread().getName() + " notificando todo mundo que não estamos pegando emails");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
