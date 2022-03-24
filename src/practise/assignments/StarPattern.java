package practise.assignments;

public class StarPattern {

	public static void main(String[] args) {
		
		// star increasing pattern
		for (int i = 0; i <= 3; i++) {

			for (int j = 0; j <= 3; j++) {

				if (j <= i) {

					System.out.print("*");
				}
			}
			System.out.println("");

		}
		
		System.out.println("------------------------------------------------------------------------------");
		// 2nd way

		for (int i = 0; i <= 3; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println("");

		}

	}

}
