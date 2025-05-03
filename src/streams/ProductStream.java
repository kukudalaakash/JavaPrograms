package streams;

import java.util.Arrays;
import java.util.List;

public class ProductStream {
	public static void main(String[] args) {
		// Sort a list of custom objects (e.g., products) by a specific field (e.g.,
		// price) in descending order.
		List<Product> products = Arrays.asList(new Product(1, "HP Laptop", 25000), new Product(2, "Dell Laptop", 30000),
				new Product(3, "Lenovo Laptop", 28000), new Product(4, "Sony Laptop", 28000),
				new Product(5, "Apple Laptop", 90000));
		products.stream().sorted((p1, p2) -> Double.compare(p1.price, p2.price)).forEach(System.out::println);

		// Given a list of products (with price), collect the names of products costing
		// more than 20,000 into a list.
		List<Product> prd = products.stream().filter(p -> p.price > 25000).toList();
		System.out.println(prd);

		// Given a list of products (with name and price), find the employee with the
		// highest salary.
		Product p = products.stream().max((p1, p2) -> Float.compare(p1.price, p2.price)).get();
		System.out.println(p.name + " " + p.price);
	}
}
