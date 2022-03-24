package practise.assignments;

public class SwapNumbers {

	public static void main(String[] args) {
		
		// To swap numbers without using 3rd variable
		
		int a = 200;
		int b = 300;

		a = a + b;

		b = a - b;
		System.out.println("b = " + b);

		a = a - b;
		System.out.println("a = " + a);

		// To swap numbers using 3rd variable

		int temp;
		int aa = 100;
		int bb = 200;

		temp = aa;
		aa = bb;
		bb = temp;

		System.out.println("aa = " + aa + "\t bb = " + bb);

	}

}
