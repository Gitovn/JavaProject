package forloop;

public class LabeledForLop {

	public static void main(String[] args) {
		System.out.println("Before for loop");
		int a = 67;

		a: for (; a > 5;) {
			System.out.println("Inside of for loop " + a);
			a -= 10;
		}

		System.out.println("-----------------------------------------------");
		ascending: for (int i = 0; i < 5; i++) {
			System.out.println("Inside of for loop " + i);
		}
		System.out.println("-----------------------------------------------");

		descending: for (int i = 5; i >= 0; i--) {
			System.out.println("Inside of for loop " + i);
		}

		System.out.println("After for loop");
	}

}
