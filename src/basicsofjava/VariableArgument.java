package basicsofjava;

import java.util.Arrays;

public class VariableArgument {
	static void print(int... values) {
		System.out.println(Arrays.toString(values));
	}

	public static void main(String[] args) {
		print(1, 2, 3, 4);
		print(1, 2);
	}
}
