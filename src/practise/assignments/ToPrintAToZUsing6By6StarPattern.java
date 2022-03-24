package practise.assignments;

public class ToPrintAToZUsing6By6StarPattern {

	public static void main(String[] args) {

		sAlphabet(6);
		// aAlphabet(6);
		// zAlphabet(6);

	}

	public static void sAlphabet(int totalRows) {
		for (int i = 0; i < totalRows - 1; i++) {

			for (int j = 0; j < totalRows; j++) {

				if ((i % 2 == 0) || (i == 1 && j == 0) || (i == 3 && j == 5)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
	}

	public static void aAlphabet(int totalRows) {

		for (int i = 0; i < totalRows; i++) {

			for (int j = 0; j < totalRows - 1; j++) {

				if ((i == 0 && j == totalRows / 2 - 1) || (i == 1 && (i == j || j == 3)) || (i == 2)
						|| (i >= 3 && (j == 0 || j == totalRows - 2))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}

	}

	public static void zAlphabet(int totalRows) {

		int decreasingRows = totalRows - 1;

		for (int i = 0; i < totalRows; i++) {

			for (int j = 0; j < totalRows; j++) {

				if (i == 0 || i == totalRows - 1 || j == decreasingRows) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			decreasingRows--;
			System.out.println("\n");
		}

	}

}
