package streams;

//Java Stream Practice Questions

//Hint: Use IntStream, filter with a custom isPrime() method, and limit.
//Given a list of numbers, find the sum of all numbers greater than 50.
//Group a list of people by their age.
//Hint: Use Collectors.groupingBy.
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareEachNum {
	public static void main(String[] args) {
		//Print the first 10 prime numbers.
		Stream.iterate(1, e -> e + 1).filter(SquareEachNum::isPrime).limit(10).forEach(e -> System.out.print(e + " "));
		System.out.println();
		// Square each number in a list and collect the results into a new list.
		List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> sqlst = lst.stream().map(e -> e * e).collect(Collectors.toList());
		System.out.println(sqlst);

		// Find the length of the longest string in a list of names.
		List<String> input = List.of("Alice", "Bob", "Charlie");

		System.out.println(input.stream().max((s1, s2) -> s1.length() - s2.length()).get().length());
		// Filter a list of integers to include only even numbers and collect them into
		// a set.
		Set<Integer> set = Stream.iterate(1, e -> e + 1).limit(20).filter(e -> e % 2 == 0).collect(Collectors.toSet());
		System.out.println(set);

		//Convert a list of strings to a single comma-separated string.
		System.out.println(input.stream().collect(Collectors.joining(",")));

		// Count how many times each word appears in a list of strings.
		List<String> sentences = Arrays.asList("Java is great", "Java is powerful", "Streams are great in Java");
		System.out.println(
				sentences.stream().flatMap(e -> Stream.of(e.split(" ")))
						.collect(Collectors.groupingBy(e -> e, Collectors.counting())));

		// Given a list of strings, return a list of strings that start with the letter
		// 'A' (case-insensitive).
		input.stream().filter(e -> e.toLowerCase().startsWith("a")).forEach(System.out::println);

		// Given a list of numbers, partition them into even and odd numbers.
		System.out.println(lst.stream().collect(Collectors.partitioningBy(e -> e % 2 == 0)));

		// Find the average of a list of doubles.
		// Hint: Use Collectors.partitioningBy.
		List<Double> dlst = List.of(1.5, 2.5, 23.5, 4.23, 5.34, 12.6, 127.34, 8.567, 9.23);
		System.out.println(dlst.stream().collect(Collectors.averagingDouble(e -> e)));

		// Count the total number of distinct words (case-insensitive) in a list of
		// sentences.
		// Hint: Use flatMap, split, map, distinct, and count.
		System.out.println(sentences.stream().flatMap(e -> Stream.of(e.toLowerCase().split(" "))).distinct().count());
	}

	static public boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
