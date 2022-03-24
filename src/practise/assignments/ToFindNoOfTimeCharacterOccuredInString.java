package practise.assignments;

public class ToFindNoOfTimeCharacterOccuredInString {

	public static void main(String[] args) {

		String str = "java code to find vowel or consonant";
		char letter = 'o';
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == letter) {
				count++;
			}
		}
		System.out.println(count);
	}

}
