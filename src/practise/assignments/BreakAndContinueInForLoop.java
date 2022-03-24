package practise.assignments;

public class BreakAndContinueInForLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 1) {
				System.out.println(i);
				continue;
			} else {
				System.out.println(i);
				break;
			}
//			System.out.println("Hi");

		}

		for (int i = 1; i <= 10; i++) {
			if (i == 1) {
				System.out.println(i);
				continue;
			}
			System.out.println(i);
			break;

		}

		for (int i = 10; i >= 1;i--) {
			if (i == 2) {
				System.out.println(i);
				break;
			}
			System.out.println(i);
			break;

		}

	}
}
