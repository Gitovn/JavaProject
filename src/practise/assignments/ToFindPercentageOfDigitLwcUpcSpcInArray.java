package practise.assignments;

public class ToFindPercentageOfDigitLwcUpcSpcInArray {

	public static void main(String[] args) {

		char array[] = { 'a', '2', 'B', 'q', '4', 'F', '0', '@', '%', '*' };

		int upper = 0, lower = 0, numeric = 0, special = 0;

		int totalChar = array.length;

		for (int i = 0; i < array.length; i++) {

			if (array[i] >= 'A' && array[i] <= 'Z') {
				upper++;
			} else if (array[i] >= 'a' && array[i] <= 'z') {
				lower++;
			} else if (array[i] >= '0' && array[i] <= '9') {
				numeric++;
			} else {
				special++;
			}
		}
		System.out.println("Uppercase letters are = " + upper);
		System.out.println("Uppercase % is = " + ((upper * 100) / totalChar));

		System.out.println("Lowercase letters are = " + lower);
		System.out.println("Lowercase % is = " + ((lower * 100) / totalChar));

		System.out.println("Special case letters are = " + special);
		System.out.println("Special case % is = = " + ((special * 100) / totalChar));

		System.out.println("Numericals are = " + numeric);
		System.out.println("Numericals % is =" + ((numeric * 100) / totalChar));
	}
}
