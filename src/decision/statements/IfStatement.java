package decision.statements;

public class IfStatement {

	public static void main(String[] args) {

		int a = 35;
		boolean flag = false;
		System.out.println("Welcome To KTCTC");

		if (a < 50) {
			System.out.println("1st if statement");
			System.out.println("2nd if statement");
		}

		if (a < 90 && flag) {
			System.out.println("3rd if statement");
			System.out.println("4th if statement");
		}

		if (flag)

			System.out.println("HI");
		System.out.println("Hello");

	}

}
