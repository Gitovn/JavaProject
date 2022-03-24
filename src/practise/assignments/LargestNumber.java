package practise.assignments;

public class LargestNumber {

	public static void main(String[] args) {
		// To find largest number among 3 numbers
		int a = 300;
		int b = 80;
		int c = 200;
		int temp, largest;

		if (a > b) {
			System.out.println("a is greater than b");

			if (a > c) {
				System.out.println("a is greater than c");
			}
			System.out.println("a is greater than b & c");

		}

		else if (b > c) {
			System.out.println("b is greater than c");

			if (b > a) {
				System.out.println("b is greater than a");
			}

			System.out.println("b is greater than a & c");

		}

		else {
			System.out.println("c is greater than a & b");
		}
		
		
		System.out.println("or ------------------------------------------------------------------------------------");
		
		
		if (a>b && a>c)
		{
			System.out.println("a is greater than b & c");	
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater than a & c");
		}
		else 
		{
			System.out.println("c is greater than a & b");
		}
		
		System.out.println("or ------------------------------------------------------------------------------------");
		
		temp = a>b ? a : b;
		
		largest = c>temp ? c : temp;
		
		System.out.println("The largest number is = " + largest );

	}
	
}