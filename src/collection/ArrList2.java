package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrList2 {

	static String aa;
	static String bb;

	public static void main(String[] args) {

		ArrayList<String> data = new ArrayList<>();

		String str = "Hi";
		String str1 = "KTCTC";

		data.add(str);
		data.add("Hello");
		data.add(str1);
		data.add(new String("ABCD"));
		data.add("Hello");
		System.out.println(data);
		data.remove(2);
		Collections.sort(data);
		data.add(aa);
		data.add(bb);

		System.out.println(data.size());

		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}

		for (String each : data) {
			System.out.println(each);
		}

	}

}
