package practise.assignments;

public class ToCheckNumberIsPallendrom {

	public static void main(String[] args) {

		String number = "353";
		String rev = "";

		for (int i = number.length() - 1; i >= 0; i--) {
			rev = rev + number.charAt(i);
		}
		System.out.println(rev);

		if (number.equals(rev)) {
			System.out.println("String is pallindrome");
		} else {
			System.out.println("String is not pallindrome");
		}

	}

}
