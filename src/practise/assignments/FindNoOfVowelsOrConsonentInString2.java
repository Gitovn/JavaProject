package practise.assignments;

public class FindNoOfVowelsOrConsonentInString2 {
	public static void main(String[] args) {

		String text = "Welcome To Ktctc Team October Batch";
		String lowerCase = text.toLowerCase();
		int vowelCnt = 0;
		int consonentCnt = 0;

		for (int i = 0; i < lowerCase.length(); i++) {

			if (lowerCase.charAt(i) == 'a' || lowerCase.charAt(i) == 'e' || lowerCase.charAt(i) == 'i'
					|| lowerCase.charAt(i) == 'o' || lowerCase.charAt(i) == 'u') {
				vowelCnt++;
			} else {
				consonentCnt++;
			}
		}

		System.out.println("Total No of characters = " + (vowelCnt + consonentCnt));
		System.out.println("Total No of vowels =" + vowelCnt);
		System.out.println("Total No of consonent =" + consonentCnt);
	}

}
