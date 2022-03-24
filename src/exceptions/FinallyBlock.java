package exceptions;

public class FinallyBlock {

	public static void main(String[] args) {
		int a = 67;
		int b = 0;
		int c = 0;

		try {

			c = a / b;

		} catch (ArithmeticException e) {

			System.out.println("Handling exception");
			c = a;
			e.printStackTrace();

		}

		finally {
			System.out.println("Connection close");
		}
	}

}
