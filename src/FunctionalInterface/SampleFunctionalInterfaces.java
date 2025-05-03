package FunctionalInterface;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SampleFunctionalInterfaces {

	public static void main(String[] args) {
		List<String> str=List.of("Akash","Hello","World","Welcome");
		// Consumer Functional Interface
		System.out.println("Consumer Functional Interface ");
		Consumer<String> c = (s) -> System.out.println(s);
		for (String word : str) {
			c.accept(word);
		}
		// Predicate Functional Interface
		System.out.println("Predicate Functional Interface");
		Predicate<String> p = (s) -> s.length() == 5;
		for (String word : str) {
			System.out.println(p.test(word));
		}
		str.stream().filter(p).forEach(c);
		// Function Functional Interface
		System.out.println("Function Functional Interface");
		Function<String, Integer> f = (s) -> s.length();
		for (String word : str) {
			System.out.print(f.apply(word) + " ");
		}
		str.stream().filter(p).map(f).forEach((s) -> System.out.println(s));
		// Supplier Functional Interface
		System.out.println("Supplier Functional Interface");
		Supplier<Integer> s = () -> new Random().nextInt(20);
		for (int i = 0; i < 10; i++) {
			System.out.print(s.get() + " ");
		}
	}

}
