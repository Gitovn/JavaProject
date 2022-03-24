package practise.assignments;

public class FindNoOfTimeABOccuresInString {
	public static void main(String[] args) {

		// Using indexOf() method
		
		String str = "ABBBDFJGGDFABFJFHYDAB";
		String chars = "AB";

		int count = countMatches(str, chars);
		System.out.println(count);

	}

	public static boolean isEmpty(String s) {
		return s == null || s.length() == 0;
	}

	public static int countMatches(String text, String st) {
		int index = 0, count = 0;

		if (isEmpty(text) || isEmpty(st)) {
			return 0;
		}

		while (true) {
			index = text.indexOf(st, index);
			if (index != -1) {
				count++;
				index += st.length();
			}

			else {
				break;
			}
		}
		return count;
	}
}
