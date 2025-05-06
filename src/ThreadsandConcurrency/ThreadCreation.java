package ThreadsandConcurrency;

class Task extends Thread {
	private int n;

	public Task(String name, int n) {
		this.setName(name);
		this.n = n;
	}

	@Override
	public void run() {
		System.out.println(this.getName() + " is Running ");
		for (int i = n * 100; i <= n * 100 + 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println(this.getName() + "terminated");
	}
}
class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("Task1 is Running ");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task1 terminated");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Task2 is Running ");
		for (int i = 11; i <= 20; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Task2 terminated");
	}
}
public class ThreadCreation {
	public static void main(String[] args) {
		Task1 t1 = new Task1();
		System.out.println("Task1 is in New State");
		t1.start();
		Task2 t2 = new Task2();
		System.out.println("Task2 is in New State");
		Thread t2thread = new Thread(t2);
		t2thread.start();
	}
}
