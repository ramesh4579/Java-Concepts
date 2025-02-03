package multithreading;


class Pen {

    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + ": is using Pen to write.");
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + ": is using Pen to finish.");
    }
}

class Paper {

    public synchronized void writeWithPenAndPaper(Pen pen) {
        System.out.println(Thread.currentThread().getName() + ": is using Paper to write.");
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + ": is using Paper to finish.");
    }
}

class MyTask1 implements Runnable {
    private Paper paper;
    private Pen pen;

    public MyTask1(Paper paper, Pen pen) {
        this.paper = paper;
        this.pen = pen;
    }

    @Override
    public void run() {
        paper.writeWithPenAndPaper(pen);
    }
}

class MyTask2 implements Runnable {
    private Paper paper;
    private Pen pen;

    public MyTask2(Paper paper, Pen pen) {
        this.paper = paper;
        this.pen = pen;
    }
    @Override
    public void run() {
        synchronized (paper){
            pen.writeWithPenAndPaper(paper);
        }

    }
}

public class DeadLock {
    public static void main(String[] args) {
        Paper paper = new Paper();
        Pen pen = new Pen();

        Thread t1= new Thread(new MyTask1(paper, pen), "Thread1");
        Thread t2= new Thread(new MyTask2(paper, pen), "Thread2");

        t1.start();
        t2.start();
    }
}
