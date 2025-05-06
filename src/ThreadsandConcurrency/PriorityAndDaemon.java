package ThreadsandConcurrency;


public class PriorityAndDaemon {
	public static void main(String[] args) {
		Task1 t1 = new Task1();
		System.out.println("Task1 is in New State");
		t1.setPriority(1);
		t1.start();

		Task2 t2 = new Task2();
		Thread t2thread = new Thread(t2);
		System.out.println("Task2 is in New State");
		t2thread.setPriority(10);
		t2thread.start();

		Task1 t3 = new Task1();
		System.out.println("Task3 is in New State");
		t3.setDaemon(true);
		t3.start();
	}
}

