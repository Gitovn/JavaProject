package breakcontinue;

public class BreakClass {

	public static void main(String[] args) {
		int a = 67;

		char ch1[] = { 'a', 'v', 'e', 'g', 'r', 'w', 't' };

		char ch2[] = { 'a', 'v', 'e', 'g', 'r', 'w', 't' };
		int intarr[] = { 12, 32, 56, 87, 23, 654 };

		// break for nestedforloop

		Outer: for (int i = 0; i < 2; i++) {

			System.out.println("Inside of outer for loop");

			Inner: for (int j = 0; j < 2; j++) {

				System.out.println("Inside of inner loop");
				break Outer;

			}

			System.out.println("After inner for loop");

		}

		// break for foreachloop

		for (int each : intarr) {
			System.out.println(each);

		}

		for (char each : ch2) {
			System.out.println(each);

			if (each == 'a' || each == 'e' || each == 'i' || each == 'o' || each == 'u') {
				System.out.println("Vowel is present");
				break;
			}

		}

		// break for forLoop

		for (int i = 0; i <= ch1.length; i++) {

			if (ch1[i] == 'a' || ch1[i] == 'e' || ch1[i] == 'i' || ch1[i] == 'o' || ch1[i] == 'u') {
				System.out.println("Vowel is present");
				break;
			}
		}

		a: for (; a > 5;) {
			System.out.println("Inside for loop");
			a--;

			if (a == 65)
				break;
		}

	}

}
