package multithreading;

public class MultiThreadExecution {
    public static void main(String[] args) {
        Long currentTime = System.currentTimeMillis();
        Thread [] threads = new Thread[9];

        for(int i=0;i<threads.length;i++){
            int finalI = i;
            threads[i] = new Thread(() -> {
               factorial(finalI +1);
            });
            threads[i].start();
        }
        for(Thread thread: threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Total Time taken: " + (System.currentTimeMillis() - currentTime));
    }

    private static void  factorial(int num){
        long factorial = 1;
        for(int i=1; i<=num; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
