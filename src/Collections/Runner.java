package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Runner {

	public static void main(String[] args) {
		List<Student> std = List.of(new Student(123, "Akash"), new Student(101, "Jakeer"), new Student(99, "Srikanth"));
		// std.add(new Student(121,"Ram"));//gets error as List.of() gives immutable set
		ArrayList<Student> student = new ArrayList<>(std);
		System.out.println(student);
		Collections.sort(student);
		System.out.println(student);
		studentdesc stddsc = new studentdesc();
		Collections.sort(student, stddsc);
		System.out.println(student);
		studentname stdname = new studentname();
		student.sort(stdname);
		System.out.println(student);
		std.forEach(a -> {
			System.out.println(a);
		});
		Iterator<Student> itr = student.iterator();
		itr.forEachRemaining(a -> {
			System.out.println(a);
		});
		System.out.println("Using List Iterator");
		ListIterator<Student> litr = student.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		student.ensureCapacity(10);
		System.out.println(student.size());
	}

}

