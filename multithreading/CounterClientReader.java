package multithreading;


public class CounterClientReader extends  Thread{

    ReadWriteLock1 counter;

    public CounterClientReader(ReadWriteLock1 counter, String name) {
        super(name);
        this.counter = counter;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + counter.getCounter());
        }
    }
}
