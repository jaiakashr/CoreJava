package Day18;

class MyThread extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                "Child Thread: " + i
            );
        }
    }
}

public class ThreadDemo2 {

    public static void main(String[] args) {

        System.out.println(
            "Main thread started"
        );

        MyThread thread = new MyThread();

        thread.start();

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                "Main Thread: " + i
            );
        }

        System.out.println(
            "Main thread finished"
        );
    }
}