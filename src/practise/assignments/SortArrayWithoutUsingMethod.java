package practise.assignments;

public class SortArrayWithoutUsingMethod {

	public static void main(String[] args) {

		int a[] = { 1, 3, 4, 2, 6, 7, 8 };
		int temp = 0;

		// before sorting array values are
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "  ");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println();
		
		// after sorting array values are
		System.out.println("Ascending ordered array is");
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + "  ");
		}
	}
}