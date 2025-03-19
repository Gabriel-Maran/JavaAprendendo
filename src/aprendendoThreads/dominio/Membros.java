package aprendendoThreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Membros {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (this.emails) {
            return emails.size();
        }
    }
    public void addMemberEmail(String email) {
        synchronized (this.emails) {
            String nameThread = Thread.currentThread().getName();
            System.out.println(nameThread+ " adicionou email a lista");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+ " checking if there are emails");
        synchronized (this.emails) {
            while (emails.isEmpty()){
                if(!open) return null;
                System.out.println(Thread.currentThread().getName()+ " não tem  email dispovinel na lista, entrando em modo de espera");
                    this.emails.wait();
            }
            return this.emails.poll();
        }
    }
    public void close(){
        synchronized (this.emails) {
            open = false;
            System.out.println(Thread.currentThread().getName()+ " notificando todo mundo que não estamos pegando emails");
            this.emails.notifyAll();
        }
    }
}
