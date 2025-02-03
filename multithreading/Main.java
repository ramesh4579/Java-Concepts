package multithreading;

public class Main {
    public static void main(String[] args) {
        /*BankAccount bankAccount = new BankAccount();
        Runnable withdraw = () -> bankAccount.withdraw(100);

        Thread transaction1 = new Thread(withdraw);
        Thread transaction2 = new Thread(withdraw);

        transaction1.start();
        transaction2.start();*/

        ReadWriteLock1 counter = new ReadWriteLock1();
        Thread client1= new CounterClient(counter, "Writer1");
        Thread client2= new CounterClient(counter, "Writer2");
        Thread client3= new CounterClientReader(counter, "Reader1");
        Thread client4= new CounterClientReader(counter, "Reader2");
        Thread client5= new CounterClientReader(counter, "Reader3");
        Thread client6= new CounterClientReader(counter, "Reader4");

        client1.start();
        client2.start();
        client3.start();
        client4.start();
        client5.start();
        client6.start();


        try {
            client1.join();
            client2.join();
            client3.join();
            client4.join();
            client5.join();
            client6.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter.getCounter());
    }
}
