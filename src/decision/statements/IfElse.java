package decision.statements;

public class IfElse {
	int b = 39;
	int a = 50;
	boolean flag = false;

	public static void main(String[] args) {

		int a = 35;
		int age = 39;

		System.out.println("Welcome To KTCTC");

		if (a >= 50) {
			System.out.println("Inside if statement");
		}

		else {
			System.out.println("Inside else statement");
		}

		IfElse obj3 = new IfElse();

		if (a < 90 && obj3.flag) {
			System.out.println("3rd if statement");
			System.out.println("4th if statement");
		}

		else {
			System.out.println("3rd else statement");
			System.out.println("4th else statement");

		}

		if (age >= 50)
			System.out.println("You can vote");
		else
			System.out.println("You can not vote");

		IfElse obj = new IfElse();

		if (obj.b >= 50) {
			System.out.println("Inside if for instance variable");
		}

		else {
			System.out.println("Inside else for instance variable");
		}

		System.out.println("After if else statement");

	}

}
