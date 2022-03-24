package practise.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortStringUsingArrayAndCollection {

	public static void main(String[] args) {

		String str = "My name is vijay. vijay is boy. vijay play cricket.";

		String arr[] = null;
		arr = str.split(" ");

		Arrays.sort(arr);

		String sortedStr = Arrays.toString(arr);
		System.out.println(sortedStr);

		System.out.println("==========================================================================");

		String str1 = "My name is vijay. vijay is boy. vijay play cricket.";
		ArrayList<String> list = new ArrayList<String>();

		arr = str.split(" ");

		for (String each : arr) {
			list.add(each);
		}
		Collections.sort(list);
		System.out.println(list);

	}
}
