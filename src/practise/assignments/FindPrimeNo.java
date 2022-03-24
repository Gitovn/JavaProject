package practise.assignments;

public class FindPrimeNo {

	public static void main(String[] args) {

		int num = 2;
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Non prime");
		}

		System.out.println("-----------------------------------------------------------------");

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count != 0) {
			System.out.println("Non prime");
		} else {
			System.out.println("prime");
		}

	}
}
