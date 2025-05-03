package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class JavaStreamMethods {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();

		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		// Converting product List into Set
		Set<Float> productPriceList = productsList.stream()
				.filter(product -> product.price < 30000) 
				.map(product -> product.price).collect(Collectors.toSet());
		System.out.println(productPriceList);

		Map<Integer, String> productPriceMap = productsList.stream()
				.collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println(productPriceMap);

		List<Float> productPList = productsList.stream().filter(p -> p.price > 10000) // filtering data
				.map(Product::toDouble) // fetching price by referring getPrice method
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPList);
	}


}