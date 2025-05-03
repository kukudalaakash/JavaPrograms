package Collections;

import java.util.HashSet;

public class HashSetSample {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(7);
		hs.add(3);
		System.out.println(hs);
		System.out.println(hs);
		for (Integer i : hs) {
			System.out.println(i);
		}
		System.out.println(hs.removeIf(n -> n > 0));
	}

}
