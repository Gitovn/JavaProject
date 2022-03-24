package whileloop;

public class UseOfForLoopAsWhileLoop {

	public static void main(String[] args) {
		System.out.println("Before while loop");
		int a = 35;
		int b = 35;

		while (a > 3) {

			System.out.println("Inside while loop");
			a = a - 10;

		}
		System.out.println("After while loop");

		System.out.println("Before for loop");

		for (; b > 3;) {
			System.out.println("Inside for loop");
			b = b - 10;

		}
		System.out.println("After for loop");

	}

}
