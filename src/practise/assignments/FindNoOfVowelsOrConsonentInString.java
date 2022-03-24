package practise.assignments;

public class FindNoOfVowelsOrConsonentInString {
	public static void main(String[] args) {

		String text = "Welcome To Ktctc Team October Batch";
		char[] chrText = text.toCharArray();
		int vowelCnt = 0;
		int consonentCnt = 0;

		for (int i = 0; i < chrText.length; i++) {
			
			if (chrText[i] == 'a' || chrText[i] == 'e' || chrText[i] == 'i' || chrText[i] == 'o' || chrText[i] == 'u'
					|| chrText[i] == 'A' || chrText[i] == 'E' || chrText[i] == 'I' || chrText[i] == 'O'
					|| chrText[i] == 'U') 
			{
				System.out.println("it is vowel = " + chrText[i]);
				vowelCnt++;
			} else {
				System.out.println("it is consonent = " + chrText[i]);
				consonentCnt++;
			}
		}

		System.out.println("Total No of characters = " + (vowelCnt + consonentCnt));
		System.out.println("Total No of vowels =" + vowelCnt);
		System.out.println("Total No of consonent =" + consonentCnt);
	}

}
