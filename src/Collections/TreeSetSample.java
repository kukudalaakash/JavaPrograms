package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Akash");
		ts.add("Hello");
		ts.add("Cat");
		ts.add("Ferarri");
		TreeSet<String> ts2 = new TreeSet<String>(new strlencmo());
		ts2.addAll(ts);
		System.out.println(ts);
		System.out.println(ts2);
		System.out.println(ts2.comparator());
//		TreeSet<Employee> ts3 = new TreeSet<Employee>();
//		ts3.add(new Employee());         Employee cannot be cast to class java.lang.Comparable
	}

}

class strlencmo implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		return arg0.length() - arg1.length() != 0 ? arg0.length() - arg1.length() : 1;
	}

}

class Employee {
	int empid;
	String empname;

	public Employee() {
		super();
	}

	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

}
