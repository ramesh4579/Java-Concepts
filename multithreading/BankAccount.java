package multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    private Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if (amount <= balance) {
                    System.out.println("Amount withdrawn : " + amount);
                    balance -= amount;
                    System.out.println("New balance : " + balance);
                }
                else{
                    System.out.println("Insufficient balance");
                    System.out.println("New balance : " + balance);
                }
            }else{
                System.out.println("Lock is not acquired. Please try again.");
            }
        } catch (InterruptedException e) {
            System.out.println("Current thread interrupted.");
            Thread.currentThread().interrupt();
        }finally {
            lock.unlock();
        }

    }
}
