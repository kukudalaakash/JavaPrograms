package streams;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	static float toDouble(Product p) {
		return p.price * 2;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + price;
	}
}