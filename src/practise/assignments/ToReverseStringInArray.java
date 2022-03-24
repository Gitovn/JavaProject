package practise.assignments;

public class ToReverseStringInArray {

	public static void main(String[] args) {

		String str = "India is my country";
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
		char revArr[] = reverse.toCharArray();

		for (int i = 0; i < revArr.length; i++) {
			System.out.print(revArr[i]);
		}

	}

}
