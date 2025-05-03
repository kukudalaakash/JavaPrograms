package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<String>();
		q.add("Apple");
		q.add("Cat");
		q.offer("Ball");
		q.offer("Dog");
//		System.out.println(q.peek());
//		System.out.println(q.element());
//		System.out.println(q.poll());
//		System.out.println(q.remove());
//		System.out.println(q);
		Deque<String> dq = new ArrayDeque<String>(q);
		dq.add("Apple");
		dq.addFirst("Ball");
		dq.addLast("Cat");
		System.out.println(dq.poll());
		System.out.println(dq);
	}
}
