package ThreadsandConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceMethods {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService es = Executors.newWorkStealingPool();
		Task t1 = new Task("Thread 1", 1);
		Task t2 = new Task("Thread 2", 2);
		Task t3 = new Task("Thread 3", 3);
		Task t4 = new Task("Thread 4", 4);
		es.execute(t1);
		es.execute(t2);
		es.execute(t3);
		es.execute(t4);
		System.out.println(es.awaitTermination(2, TimeUnit.SECONDS));
		System.out.println(es.isShutdown());
		es.shutdown();
		System.out.println(es.isShutdown());
		System.out.println(es.awaitTermination(1, TimeUnit.SECONDS));
	}
}
