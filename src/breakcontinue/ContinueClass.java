package breakcontinue;

public class ContinueClass {

	public static void main(String[] args) {

		System.out.println("Before for loop");
		for (int i = 0; i < 5; i++) {

			System.out.println("Inside of for loop " + i);

			if (i > 1) {
				continue;
			}
			System.out.println("KTCTC " + i);
		}
		System.out.println("After for loop");

	}

}
