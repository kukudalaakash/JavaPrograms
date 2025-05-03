package generics;

import java.util.List;

public class GenricsRunner {
	public static void main(String[] args) {
		CustomArray<String> arr = new CustomArray<>();
		arr.addElement("Akash");
		arr.addElement("Ramesh");
		CustomArray<Integer> arr1 = new CustomArray<>();
		arr1.addElement(1);
		arr1.addElement(2);
		System.out.println(arr);
		System.out.println(arr1);
		CustomGenricList<Float> farr = new CustomGenricList<>();
		farr.addElement(1.5f);
		System.out.println(farr);
//		CustomGenricList<Character> carr = new CustomGenricList<>(); raises error because character does not belong to number
		adding("ab", "cd");
		listadd(List.of(1, 2, 3, 4));
		System.out.println(getFirstElement(List.of(1, 2, 3, 4)));
	}

	public static <T> T adding(T t1, T t2)
	{
		System.out.println(t1);
		return t1;
	}

	public static void listadd(List<? extends Number> lst) {
		System.out.println(lst.get(2));
	}

	public static <T> T getFirstElement(List<T> list) {
		return list.get(4); // Potential ClassCastException due to type erasure
	}
}
