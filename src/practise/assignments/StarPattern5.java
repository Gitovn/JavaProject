package practise.assignments;

public class StarPattern5 {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i < n; i++) {

			for (int j = 2 * (n - i); j >= 0; j--) { // For Loop for Row

				System.out.print(" "); // Print Spaces

			}

			for (int j = 0; j <= i; j++) { // For Loop for col

				System.out.print("* "); // Print Star

			}

			System.out.println();

		}

	}

}
