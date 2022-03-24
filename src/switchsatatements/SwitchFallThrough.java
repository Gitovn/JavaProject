package switchsatatements;

public class SwitchFallThrough {

	public static void main(String[] args) {

		System.out.println("Before switch");

		int a = 2;

		switch (a) {
		case 4:
			System.out.println("case 4");
		case 3:
			System.out.println("case 3");
		case 2:
			System.out.println("case 2");
		case 1:
			System.out.println("case 1");
		default:
			System.out.println("default code");
		}

		System.out.println("After switch");

	}

}
