package practise.assignments;

public class ToFindVowelOrConsonent {

	public static void main(String[] args) {

		char[] varr = { 'a', '1', 'f', 'i', 'j', 'o', 'q', '3', '9', 'A', '1', '6', '4' };

		for (int i = 0; i < varr.length; i++)

		{

			if (varr[i] == 'a' || varr[i] == 'e' || varr[i] == 'i' || varr[i] == 'o' || varr[i] == 'u' || varr[i] == 'A'
					|| varr[i] == 'E' || varr[i] == 'I' || varr[i] == 'O' || varr[i] == 'U') {
				System.out.println("character is vowel = " + varr[i]);
			} else if (varr[i] == '0' || varr[i] == '1' || varr[i] == '2' || varr[i] == '3' || varr[i] == '4'
					|| varr[i] == '5' || varr[i] == '6' || varr[i] == '7' || varr[i] == '8' || varr[i] == '9') {
				System.out.println("It is numerical value = " + varr[i]);
			} else {
				System.out.println("character is consonent = " + varr[i]);
			}
		}

	}

}
