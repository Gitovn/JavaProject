package practise.assignments;

public class StarPattern2 {

	public static void main(String[] args) {

		for (int i = 0; i <= 3; i++) {

			for (int j = 3; j >= 0; j--) {

				if (j >= i) {

					System.out.print("*");
				}
			}
			System.out.println("");

		}

		System.out.println("------------------------------------------------------------------------------");
		// 2nd way

		for (int i = 0; i <= 3; i++) {

			for (int j = 3; j >= i; j--) {

				System.out.print("*");

			}
			System.out.println("");

		}

	}

}
