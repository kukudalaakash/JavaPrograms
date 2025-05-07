package ThreadsandConcurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BiCounter {
	private int i = 0;
	private int j = 0;
	Lock lockForI = new ReentrantLock(true);
	Lock lockForJ = new ReentrantLock(true);
	public void incrementI() {
		lockForI.lock();
		i++;
		lockForI.unlock();
	}

	public void incrementJ() {
		lockForJ.lock();
		j++;
		lockForJ.unlock();
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
}

class CounterThread extends Thread {
	private BiCounter counter;
	private int threadid;

	public CounterThread(int i, BiCounter counter) {
		this.threadid = i;
		this.counter = counter;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			counter.incrementI();
			System.out.println("I incremented by " + threadid + " to " + counter.getI());
			counter.incrementJ();
			System.out.println("J incremented by " + threadid + " to " + counter.getJ());
		}
	}
}

class BiCounterAtomicThread extends Thread {
	private BiCounterUsingAtomicInteger counter;
	private int threadid;

	public BiCounterAtomicThread(int i, BiCounterUsingAtomicInteger counter) {
		this.threadid = i;
		this.counter = counter;
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				counter.incrementI(threadid);
				counter.incrementJ(threadid);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
public class LockAndReEntrantLock {

	public static void main(String[] args) {
//		BiCounter b1 = new BiCounter();
//		CounterThread c1 = new CounterThread(1, b1);
//		CounterThread c2 = new CounterThread(2, b1);
//		c1.start();
//		c2.start();

		BiCounterUsingAtomicInteger ba1 = new BiCounterUsingAtomicInteger();
		BiCounterAtomicThread bt1 = new BiCounterAtomicThread(1, ba1);
		BiCounterAtomicThread bt2 = new BiCounterAtomicThread(2, ba1);
		BiCounterAtomicThread bt3 = new BiCounterAtomicThread(3, ba1);
		bt1.start();
		bt2.start();
		bt3.start();
	}

}
