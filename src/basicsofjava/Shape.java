package basicsofjava;

public class Shape {

	int sides;

	public Shape() {
		System.out.print("Shape constructor called");
	}
	public Shape(int i) {
		sides = i;
	}

	public void printnumofsides() {
		System.out.println(sides);

	}

}
