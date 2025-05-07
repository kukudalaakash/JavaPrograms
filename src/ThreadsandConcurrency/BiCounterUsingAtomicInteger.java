package ThreadsandConcurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterUsingAtomicInteger {
	private AtomicInteger i = new AtomicInteger(0);
	private AtomicInteger j = new AtomicInteger(0);

	public synchronized void incrementI(int threadid) throws InterruptedException {
		Thread.currentThread().sleep(1000);
		i.incrementAndGet();
		System.out.println("I got incremented by " + threadid + " to" + i);
	}

	public synchronized void incrementJ(int threadid) throws InterruptedException {
		Thread.currentThread().sleep(1000);
		j.incrementAndGet();
		System.out.println("J got incremented by " + threadid + " to" + j);
	}

	public int getI() {
		return i.get();
	}

	public int getJ() {
		return j.get();
	}
}
