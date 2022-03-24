package forloop;

public class NestedForLoop {

	public static void main(String[] args) {

		for (int i = 0; i < 2; i++) {

			System.out.println("Inside of outer for loop");

			for (int j = 0; j < 2; j++) {

				System.out.println("Inside of inner loop");

			}

			System.out.println("After inner for loop");

		}

		System.out.println("After for loop");

	}

}
