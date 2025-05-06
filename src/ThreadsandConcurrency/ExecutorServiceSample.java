package ThreadsandConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ExecutorServiceSample {
	public static void main(String[] args) {
		ExecutorService e = Executors.newSingleThreadExecutor();
		Task1 t1 = new Task1();
		Task2 t2 =new Task2();
		Thread t2thread = new Thread(t2);
		t1.setDaemon(true);
		t2thread.setPriority(10);
		e.execute(t1);
		e.execute(t2thread);
		e.shutdown();
	}
}
