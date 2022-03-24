package practise.assignments;

public class FindNoOfTimeABOccuresInString2 {
	public static void main(String[] args) {

		// Using split() method

		String str = "ABBBDFJGGDFABFJFHYDAB";
		String chars = "AB";

		int count = countMatches(str, chars);
		System.out.println(count);

	}

	public static boolean isEmpty(String s) {
		return s == null || s.length() == 0;
	}

	public static int countMatches(String text, String st) {
		
		if (isEmpty(text) || isEmpty(st)) {
			return 0;
		}

		return text.split(st, -1).length - 1;
	}
}
