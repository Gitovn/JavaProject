package practise.assignments;

public class CodeToFindFrequencyOfCharacters {

	public static void main(String[] args) {

		String str = "java code to find vowel or consonant";

		int[] freq = new int[str.length()];

		char chr[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			freq[i] = 1;

			for (int j = i + 1; j < str.length(); j++) {
				if (chr[i] == chr[j]) {
					freq[i]++;
					chr[j] = '0';
				}
			}
 
		}

		for (int i = 0; i < freq.length; i++) {
			if (chr[i] != ' ' && chr[i] != '0') {
				System.out.println(chr[i] + "-" + freq[i]);
			}
		}

	}

}
