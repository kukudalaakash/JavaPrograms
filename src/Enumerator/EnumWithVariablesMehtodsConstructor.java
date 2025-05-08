package Enumerator;

enum Weekdays {
	Sunday(1), Monday(2), Tuesday(3), Wednesday(4), Thursday(5), Friday(6), Saturday(7);

	private int value;

	private Weekdays(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
public class EnumWithVariablesMehtodsConstructor {
	public static void main(String[] args) {
		Weekdays day = Weekdays.Thursday;
		System.out.println(day.ordinal());
		System.out.println(day.getValue());
	}
}
