package basicsofjava;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printt(3);
		Shape circle = new Shape();
		Shape square = new Shape(4);
		square.printnumofsides();
	}

	public static void printt(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}

}
