package ThreadsandConcurrency;

class work extends Thread {
	private int i;

	public work(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		try {
			Printer instance = Printer.getInstance();
			synchronized (instance) {
				if (i == 1) {
					instance.wait(3000);
				}
				instance.print20(i);
				instance.notifyAll();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Printer {

	private static Printer instance;

	private Printer() {

	}

	public static Printer getInstance() {
		if (instance == null) {
			instance = new Printer();
		}
		return instance;
	}

	public synchronized void print20(int i) throws InterruptedException {

		for (int j = 1; j <= 10; j++) {
			System.out.print(i + " " + j + "   ");
		}

		System.out.println();
	}
}
public class SynchronizationSample {
	public static void main(String[] args) throws InterruptedException {
		work t1 = new work(1);

		work t2 = new work(2);

		work t3 = new work(3);

		t1.start();

//		t1.join();
		t2.start();
//		t2.join();
		t3.start();

	}
}
