package practise.assignments;

public class Print1to100EvenAndOddNos {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if (i % 2 != 0) { 		// for even
				continue;
			}
			System.out.println(i);
		}
		System.out.println("-----------------------------------------------");

		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) { 		 // for odd
				continue;
			}
			System.out.println(i);
		}

	}

}
