package Collections;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + " " + name;
	}

	@Override
	public int compareTo(Student y) {
		return this.id == y.id ? 0 : (this.id > y.id ? 1 : -1);
	}

}

class studentdesc implements Comparator<Student> {
	@Override
	public int compare(Student arg0, Student arg1) {
		return arg1.getId() - arg0.getId();
	}
}

class studentname implements Comparator<Student> {
	@Override
	public int compare(Student arg0, Student arg1) {
		return arg1.getName().compareTo(arg0.getName());
	}
}
