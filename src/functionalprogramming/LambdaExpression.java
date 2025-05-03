package functionalprogramming;

import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		List<String> lst = List.of("Akash", "Rahul", "Ramesh");
		List<Integer> Ilst = List.of(12, 13, 5, 1, 33, 10);
		printFunc(lst);
		printhFilterFP(lst);
		int sum = sumFP(Ilst);
		System.out.println(sum);
		printSumFactor(Ilst);

	}

	private static void printSumFactor(List<Integer> ilst) {
		final int factor = 2;
		int sum = ilst.stream().reduce(0, (n1, n2) -> n1 + n2 * factor);
		System.out.println("Sum Factor: " + sum);
		// factor = 3;// raises error

	}

	private static int sumFP(List<Integer> lst) {
		int sum = lst.stream().reduce(0, (number1, number2) -> {
			System.out.println(number1 + " " + number2);
			return number1 + number2;
		});
		return sum;
	}

	private static void printhFilterFP(List<String> lst) {
		lst.stream().filter(ele -> ele.endsWith("sh")).forEach(e -> System.out.println("Name with Filter: " + e));

	}

	private static void printFunc(List<String> lst) {
		lst.stream().forEach(e -> System.out.println("Name: " + e)
			);
		
	}

}
