package practise.assignments;

public class ToCheckStringIsPallendrom {

	public static void main(String[] args) {

		String abba = "abba";
		String rev = "";

		for (int i = abba.length() - 1; i >= 0; i--) {
			rev = rev + abba.charAt(i);
		}
		System.out.println(rev);

		if (abba.equals(rev)) {
			System.out.println("String is pallindrome");
		} else {
			System.out.println("String is not pallindrome");
		}

	}

}
