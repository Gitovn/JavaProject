package practise.assignments;

public class ToFindPercentageOfDigitLwcUpcSpcInString {

	public static void main(String[] args) {

		String str = "india is my country 3454564 dfghrtherth 567678 drfhft BBCH";

		char arr[] = str.toCharArray();
		int upper = 0, lower = 0, numeric = 0, special = 0;

		int totalChar = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (Character.isUpperCase(arr[i])) {
				upper++;
			} else if (Character.isLowerCase(arr[i])) {
				lower++;
			} else if (Character.isDigit(arr[i])) {
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
