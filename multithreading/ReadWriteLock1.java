package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock1 {
    private int counter = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock writeLock= lock.writeLock();
    private final Lock readLock= lock.readLock();

    public void increment(){
        writeLock.lock();
        try{
        counter++;
        Thread.sleep(50);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            writeLock.unlock();
        }

    }

    public int getCounter(){
        readLock.lock();
        try{
            return counter;
        }finally {
            readLock.unlock();
        }
    }
}
