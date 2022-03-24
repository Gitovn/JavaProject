package arrayinclass;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int marr[][] = { { 23, 44 }, { 11, 37 }, { 34535, 45646, 3215, 5654, 9898, 3132 } };

		for (int each[] : marr) {

			for (int e : each) {

				System.out.println(e);

			}

		}
		System.out.println("After for each loop");

	}

}
