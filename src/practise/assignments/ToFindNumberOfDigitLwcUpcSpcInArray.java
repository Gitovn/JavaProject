package practise.assignments;

public class ToFindNumberOfDigitLwcUpcSpcInArray {

	public static void main(String[] args) {

		char array[] = { 'a', '2', 'B', 'q', '4', 'F', '0', '@', '%', '*' };

		int upper = 0, lower = 0, numeric = 0, special = 0;

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
		System.out.println("Lowercase letters are = " + lower);
		System.out.println("Special case letters are = " + special);
		System.out.println("Numericals are = " + numeric);
	}
}
