package com.gabrielmaran.aprendendoThreads.teste;

public class DeadLockTeste01 {
    public static void main(String[] args) { //DeadkLock ocorrendo
        Object lock1 = new Object();
        Object lock2 = new Object();
        Runnable r1 = () -> {
            synchronized (lock1){
                System.out.println("Thread 1: Segurando lock 1");
                System.out.println("Thread 1: Esperando lock 2");
                synchronized (lock2){
                    System.out.println("Thread 1: Segurando lock 2");
                }
            }
        };
        Runnable r2  = () -> {
            synchronized (lock2){
                System.out.println("Thread 2: Segurando o2");
                System.out.println("Thread 2: Esperando o1");
                synchronized (lock1){
                    System.out.println("Thread 2: Segurando lock 1");
                }
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
