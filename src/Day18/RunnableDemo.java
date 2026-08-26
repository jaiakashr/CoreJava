package Day18;

class Counter1 implements Runnable {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                "Counter 1: " + i
            );

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(
                    "Counter 1 interrupted"
                );
            }
        }
    }
}

class Counter2 implements Runnable {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                "Counter 2: " + i
            );

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println(
                    "Counter 2 interrupted"
                );
            }
        }
    }
}
public class RunnableDemo {
	public static void main(String[] args) throws InterruptedException {

        Thread t1 =
            new Thread(new Counter1());

        Thread t2 =
            new Thread(new Counter2());

        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println("Threads are completed ");

    }
}
