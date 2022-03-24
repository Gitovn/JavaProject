package arrayinclass;

import java.util.Arrays;

public class ArrayClass2 {

	public static void main(String[] args) {
		// String array

		String strarr[] = { "HI", "Welcome", "To", "KTCTC" };
		String strarr1[] = { "HI", "Welcome", "To", "KTCTC" };
		ArrayClass2 obj = new ArrayClass2();
		Arrays.sort(strarr1);
		System.out.println(strarr);
		System.out.println(obj);

		boolean flag = Arrays.equals(strarr, strarr1);
		System.out.println(flag);

		// Char array

		char charr[] = { 'a', 'c', 'r', 'w', 'd', '3', '5', ' ', '#' };
		Arrays.sort(charr);

		char charr1[] = new char[5];
		charr1[0] = 'a';
		charr1[1] = 'c';
		charr1[2] = 'q';
		charr1[3] = 'w';
		charr1[4] = 'd';

		boolean af = Arrays.equals(charr, charr1);
		System.out.println(af);

		int lng = charr.length;
		System.out.println(lng);

	}

}
