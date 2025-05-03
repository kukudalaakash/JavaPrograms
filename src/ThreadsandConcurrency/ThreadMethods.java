package ThreadsandConcurrency;

public class ThreadMethods {
	public static void main(String[] args) {
		Task1 t1 = new Task1();
		System.out.println(t1.getState());
		t1.setPriority(1);
		t1.start();
		System.out.println(t1.getState());

		Task2 t2 = new Task2();
		Thread t2thread = new Thread(t2);
		t2thread.setPriority(10);
		System.out.println("Thread 2 Name" + (!t2thread.getName().equals("-1") ? t2thread.getName() : "No name"));
		t2thread.start();

		Task1 t3 = new Task1();
		System.out.println("Thread 3 ID:" + t3.getId());
		t3.setDaemon(true);
		t3.start();
	}
}
