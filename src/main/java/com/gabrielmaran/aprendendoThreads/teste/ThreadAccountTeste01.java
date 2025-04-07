package com.gabrielmaran.aprendendoThreads.teste;

import com.gabrielmaran.aprendendoThreads.dominio.Account;

public class ThreadAccountTeste01 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withDrawal(10);
            if(account.getBalance() < 0){
                System.out.println("EITA!!!!!!!!!!!");
            }
        }
    }

    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTeste01 threadAccountTeste01 = new ThreadAccountTeste01();
        Thread t1 = new Thread(threadAccountTeste01, "NomeDoThread");
        Thread t2 = new Thread(threadAccountTeste01, "NomeDoThreadDois");
        t1.start();
        t2.start();
    }
//    private static synchronized void print(){}
//    private synchronized void withDrawal(int amount) {}
    private void withDrawal(int amount) {
        synchronized (account) {
            System.out.println(Thread.currentThread().getName()+" *** dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName() + " está indo sacar dinheiro");
                account.withDrawal(amount);
                System.out.println(Thread.currentThread().getName() + " completou o saque, o valor atual da conta " + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque " + account.getBalance());
            }
        }
        System.out.println(Thread.currentThread().getName()+" !!! fora do synchronized");
    }
}
