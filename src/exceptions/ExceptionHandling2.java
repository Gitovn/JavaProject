package exceptions;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		int a = 23;
		int b = 4;
		System.out.println("Before exception");
		int arr[] = {34,55,32};

		int c = 0;
		String data = null;

		try {

			c = a / b;
			data.toLowerCase();
			System.out.println(arr[4]);
			System.out.println("In try block");

		} catch (ArithmeticException e) {

			System.out.println("Handling exception");
			c = a;
			e.printStackTrace();

		}

		catch (NullPointerException e) {

			System.out.println("Handling exception");
			data = "KTCTC";
			System.out.println(data.toLowerCase());
			e.printStackTrace();

		}
		
		catch (Exception e) { 

		System.out.println("Common catch block");
		
		e.printStackTrace();

	}
		System.out.println(a);
		System.out.println("After exception");

	}

}
