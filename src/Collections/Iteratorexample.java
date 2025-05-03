package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorexample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(101);
		al.add(102);
		al.add(104);
		Iterator i = al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}
	}
}
