package Exceptions;

public class ExceptionSample {
	public static void main(String[] args) {
		try {
			int i = 10 / 0;
			System.out.println("This doesn't print");
		} catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
