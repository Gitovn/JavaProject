package practise.assignments;

public class FindLargestNoFromArray {

	public static void main(String[] args) {

		int a[] = { 11, 2, 3, 4, 55, 6, 7, 81 };
		int max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println("Largest No is = " + max);
	}

}
