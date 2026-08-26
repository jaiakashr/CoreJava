package Day18;

class MyThreadd extends Thread {

    public void run() {

        for (int i = 1; i <= 3; i++) {

            System.out.println(
                "Child: " + i
            );
        }
    }
}

public class JoinThread {
   
	public static void main(String[] args)
			
			throws InterruptedException {

            MyThreadd thread = new MyThreadd();

            thread.start();

            thread.join();

            System.out.println(
                "Main finished"
            );
        }
}