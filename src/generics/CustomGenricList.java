package generics;

import java.util.LinkedList;

public class CustomGenricList<T extends Number> {
	LinkedList<T> list = new LinkedList<>();

	public void addElement(T ele) {
		list.add(ele);
	}

	public T removeElement(T ele) {
		list.remove(ele);
		return ele;
	}

	@Override
	public String toString() {
		return list.toString();
	}
}
