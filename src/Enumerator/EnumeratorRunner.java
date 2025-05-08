package Enumerator;

import java.util.Arrays;

enum Fruits {
	APPLE, ORANGE, BANANA, PINE_APPLE;

	enum SeasonalFruits {
		MANGO, GUAVA, WATERMELON, MUSK_MELON;
	}
}

public class EnumeratorRunner {
	public static void main(String[] args) {
		Fruits fruit1 = Fruits.APPLE;
		System.out.println(fruit1);
		Fruits.SeasonalFruits fruit2 = Fruits.SeasonalFruits.MUSK_MELON;
		System.out.println(fruit2.name() + " ordinal is " + fruit2.ordinal());
		Fruits fruit3 = Fruits.valueOf("banana".toUpperCase());
		System.out.println(fruit1.compareTo(fruit3));
		System.out.println(Arrays.toString(Fruits.SeasonalFruits.values()));
		Fruits fruits[] = { Fruits.ORANGE, Fruits.PINE_APPLE, Fruits.BANANA };
		for (Fruits fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
