package practise.assignments;

public class FindNoOfTimeSubstringOccuresInString {
	public static void main(String[] args) {

		// Using split() method

		String str = "My name is vijay. vijay is boy. vijay play cricket.";
		String subStr = "vijay";

		int count = countMatches(str, subStr);
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
