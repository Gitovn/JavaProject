package practise.assignments;

public class SwapTwoStringsByUsingThirdVariable {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		String temp;

		System.out.println("Before swap = " + s1 + " " + s2);
		temp = s1;
		s1 = s2;
		s2 = temp;

		System.out.println("After swap = " + s1 + " " + s2);
	}
}
