package practise.assignments;

public class FindSmallestNoFromArray2 {

	public static void main(String[] args) {

		int a[] = { 11, 2, 3, 4, 55, 6, 7, 81 };
		int min = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] < min) {
				min = a[i];
			}

		}
		System.out.println("Smallest No is = " + min);
	}

}
