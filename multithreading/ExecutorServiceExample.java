package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        long startTimeInMs= System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);
            for (int i = 1; i < 10; i++) {
                int finalI= i;
                Future<?> future= executor.submit(() -> {
                    factorial(finalI);
                });
            }

        executor.shutdown();
        try {
            executor.awaitTermination(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Total time taken: "+(System.currentTimeMillis()-startTimeInMs));
    }

    private static void  factorial(int num){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long factorial = 1;
        for(int i=1; i<=num; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
