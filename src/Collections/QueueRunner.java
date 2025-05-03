package Collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner {

	public static void main(String[] args) {
		// Create a priority queue with a comparator that sorts strings by length
		// (ascending)
		Queue<String> queue = new PriorityQueue<>(new StringLenComp());

		// Add elements to the queue
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));

		// Poll elements from the queue and print them
		System.out.println(queue.poll()); // Cat (length 3)
		System.out.println(queue.poll()); // Zebra (length 5)
		System.out.println(queue.poll()); // Monkey (length 6)
		System.out.println(queue.poll()); // null (queue is empty)
	}
}

class StringLenComp implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		// Compare by length (ascending order)
		return s1.length() - s2.length();
	}
}
