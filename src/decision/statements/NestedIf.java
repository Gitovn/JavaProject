package decision.statements;

public class NestedIf {

	public static void main(String[] args) {

		System.out.println("Welcome");

		int marks = 65;

		if (marks < 30) {
			System.out.println("You are fail");
		}

		else if (marks >= 35) {
			System.out.println("You are pass");

			if (marks > 35 && marks < 50) {
				System.out.println("You have got 2nd class");
			}

			else if (marks > 50 && marks < 65) {
				System.out.println("You have got 1st class");
			}

			else {
				System.out.println("You have got distinction");
			}

		}

		System.out.println("After nested if statement");

	}

}
