package Day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Counter {

    private int count = 0;

    public synchronized void increment() {

        count++;

    }

    public int getCount() {

        return count;

    }
}

public class SynchronizationAndExecutor {

    public static void main(String[] args)throws InterruptedException {

        Counter counter = new Counter();

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {

            executor.submit(() -> {

                for (int j = 0; j < 1000; j++) {

                    counter.increment();

                }

            });
        }

        executor.shutdown();

        executor.awaitTermination(
            10,
            TimeUnit.SECONDS
        );

        System.out.println(
            "Final count: " +
            counter.getCount()
        );
    }
}