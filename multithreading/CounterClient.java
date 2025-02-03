package multithreading;


public class CounterClient extends  Thread{

    ReadWriteLock1 counter;

    public CounterClient(ReadWriteLock1 counter, String name) {
        super(name);
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.counter.increment();
            System.out.println(Thread.currentThread().getName()+ " incremented.");
        }
    }
}
