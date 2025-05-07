package ThreadsandConcurrency;

class Resource {
	static int value = 0;

	public static void produce() throws InterruptedException {
		synchronized (Resource.class) {
			if (value > 10) {
				Resource.class.wait();
			}
			value++;
			System.out.println("Produced value " + value);
			Resource.class.notifyAll(); // Notify consumers
			Resource.class.wait(900);
		}
	}

	public static int consume() throws InterruptedException {
		synchronized (Resource.class) {
			while (value == 0) {
				Resource.class.wait(1000); // Wait for something to consume
			}
			int consumed = value--;
			Resource.class.notifyAll(); // Notify producers
			return consumed;
		}
	}
}

class TaskCAP extends Thread {
	int i;

	public TaskCAP(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println(Resource.consume() + " Consumed by " + i);
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ProducerAndConsumer {
	public static void main(String[] args) throws InterruptedException {
		TaskCAP t1 = new TaskCAP(1);
		TaskCAP t2 = new TaskCAP(2);
		TaskCAP t3 = new TaskCAP(3);
		t1.start();
		t2.start();
		t3.start();
		while (true) {
			Resource.produce();
		}
	}
}
