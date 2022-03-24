package exceptions;

public class ExceptionHandling3 {

	public static void main(String[] args) {

		int a = 23;
		int b = 0;
		System.out.println("Before exception");
		int arr[] = {34,55,32};

		int c = 0;
		String data = null;

		try {

			c = a / b;
			try
			{
				System.out.println(arr[4]);
				
			} 
			catch (Exception e)
			{
				e.printStackTrace();
				System.out.println("Array does not have provided index");
			}
			
			data.toLowerCase();
			System.out.println("In try block");

		} catch (ArithmeticException e) {

			System.out.println("Handling exception");
			c = a;
			e.printStackTrace();

		}
	
		catch (Exception e) { 

		System.out.println("Common catch block");
		
		try {
			data.charAt(45);
			data = "KTCTC";
		} 
		
		catch (Exception e2) 
		{
			data = "KTCTC";
		}
		
		e.printStackTrace();

	}
		
		System.out.println("After exception");

	}

}
