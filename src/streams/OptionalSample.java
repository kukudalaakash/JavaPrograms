package streams;

import java.util.Optional;

public class OptionalSample {
	public static void main(String[] args) {
		String[] str = new String[10];
		Optional<String> op = Optional.ofNullable(str[5]);
		System.out.println("Present:" + op.isPresent());
		System.out.println("Empty:" + op.isEmpty());
		System.out.println(op.orElse("String 5 is Empty"));
		System.out.println(op.orElseGet(() -> "String 5 is Empty"));
		// System.out.println(op.get()); raises error has op is null
		str[5] = "Akash";
		op = Optional.ofNullable(str[5]);
		op.ifPresent(System.out::println);
		System.out.println(op.get());
		System.out.println(op.orElse("String 5 is Empty"));
		System.out.println(op.orElseGet(() -> "String 5 is Empty"));
	}
}
