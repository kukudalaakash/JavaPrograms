package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsSample {
	public static void main(String[] args) {
		List<Integer> lst = List.of(12, 13, 5, 1, 33, 10, 10, 12);
		findmaxusingreduce(lst);
		findmaxusingmax(lst);
		flatmapsample(lst);
		distinctsample(lst);
		finddistinctcount(lst);
		isnumber(lst);
		findnumber(lst);
		Stream.generate(() -> 1).limit(10).forEach(System.out::print);

	}

	private static void findnumber(List<Integer> lst) {
		System.out.println(lst.stream().findFirst().get());
		System.out.println(lst.stream().findAny().get());
	}

	private static void isnumber(List<Integer> lst) {
		System.out.println(lst.stream().anyMatch(e -> e == 12));
		System.out.println(lst.stream().allMatch(e -> e > 10));
		System.out.println(lst.stream().noneMatch(e -> e > 100));
	}

	private static void finddistinctcount(List<Integer> lst) {
		System.out.println(lst.stream().distinct().count());

	}

	private static void distinctsample(List<Integer> lst) {
		System.out.println(
				lst.stream().distinct().peek(System.out::println).skip(3).collect(Collectors.toList()));
	}

	private static void flatmapsample(List<Integer> lst) {
		System.out.println(
			    lst.stream()
						.flatMap(n -> {
							ArrayList<Integer> lst1 = new ArrayList<>();
							for (int i = 1; i <= n; i++) {
								if(n%i==0) {
									lst1.add(i);
								}
							}
							return lst1.stream();
						})
						.collect(Collectors.toList())
			);

	}
	private static void findmaxusingmax(List<Integer> lst) {
		Optional<Integer> max = lst.stream().max((n1, n2) -> n1 - n2);
		System.out.println(max.get());
	}

	private static void findmaxusingreduce(List<Integer> lst) {
		int max = lst.stream().reduce(0, (n1, n2) -> {
			n1 = n2 > n1 ? n2 : n1;
			return n1;
		});
		System.out.println(max);
	}
}
