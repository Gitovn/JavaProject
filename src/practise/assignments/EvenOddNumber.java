package practise.assignments;

public class EvenOddNumber {

	public static void main(String[] args) {
		// To find Even or Odd number
		int a = 41;
		int b = 2;

		if (a % b == 0) {

			System.out.println("Number is even");

		} else {
			System.out.println("Number is Odd");
		}

		// or

		if (a % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is odd");
		}
	}

}
