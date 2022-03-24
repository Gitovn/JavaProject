package practise.assignments;

public class FindNoOfVowelsInArray {
	public static void main(String[] args) {

		char[] varr = { 'a', '1', 'f', 'i', 'j', 'o', 'q', '3', '9', 'A' };
		int count = 0;

		for (int i = 0; i < varr.length; i++)
		{
			if (varr[i] == 'a' || varr[i] == 'e' || varr[i] == 'i' || varr[i] == 'o' || varr[i] == 'u' || varr[i] == 'A'
					|| varr[i] == 'E' || varr[i] == 'I' || varr[i] == 'O' || varr[i] == 'U') {
				System.out.println(varr[i]);
				count++;
			}
		}

		System.out.println("Total No of vowels = " + count);
	}

}
