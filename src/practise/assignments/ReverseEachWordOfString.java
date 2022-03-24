package practise.assignments;

public class ReverseEachWordOfString {

	public static void main(String[] args) {

		String str = "India is my country";

		String smallString[] = str.split(" ");
		String reversedString = "";

		for (int i = 0; i < smallString.length; i++) {
			String words = smallString[i];
			String reversedWord = "";

			for (int j = words.length() - 1; j >= 0; j--) {
				reversedWord = reversedWord + words.charAt(j);

			}

			reversedString = reversedString + reversedWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	}

}
