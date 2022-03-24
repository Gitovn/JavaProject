package practise.assignments;

public class ToPrintNumbersInReverse {

	public static void main(String[] args) {

		// to reverse string using for loop

		String name = "Ajay Patil";
		String revName = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			revName = revName + name.charAt(i);
		}
		System.out.println(revName);

		// to reverse number string using while loop

		String number = "123456789";
		int num = Integer.parseInt(number);
		int reverse = 0;

		while (num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}

		String revNum = String.valueOf(reverse);
		System.out.println("Reverse number is" + revNum);

		// Using for loop =========================================================

		String number1 = "123456789";
		int num1 = Integer.parseInt(number1);
		int reverse1 = 0;

		for (; num1 != 0; num1 = num1 / 10) {
			int remainder1 = num1 % 10;
			reverse1 = reverse1 * 10 + remainder1;
		}

		String revNum1 = String.valueOf(reverse1);
		System.out.println("Reverse number is" + revNum1);

	}
}
