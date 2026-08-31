package Day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		Runnable task = () -> {
			System.out.println(Thread.currentThread().getName()+ " is running ");
		};
		
		executor.submit(task);
		executor.submit(task);
		executor.submit(task);
		executor.submit(task);
		executor.submit(task);
		executor.submit(task);
	}

}
