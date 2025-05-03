package generics;

import java.util.ArrayList;

public class CustomArray<T> {
	private ArrayList<T> list = new ArrayList<>();

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
