package exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {

		int a = 23;
		int b = 4;
		System.out.println("Before exception");

		int c = 0;
		String data = null;
		
		try {

			c = a / b;
 			data.toLowerCase();
			System.out.println("In try block");

		} catch (ArithmeticException e) { 

			System.out.println("Handling exception");
			c = a;
			e.printStackTrace();

		}
		System.out.println(a);
		System.out.println("After exception");

	}

}
