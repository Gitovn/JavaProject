package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListClass {

	static Integer aa;
	static Integer bb;

	public static void main(String[] args) {

		LinkedList<Integer> data = new LinkedList<Integer>();

		Integer a = new Integer(45);
		Integer b = new Integer(33);

		data.add(a);
		data.add(b);
		data.add(new Integer(45));
		data.add(56);
		int siz = data.size();
		System.out.println(siz);
		Collections.sort(data);
		System.out.println(data);
		data.remove(2);
		data.add(a);
		data.add(b);
		data.add(a);
		data.add(b);
		System.out.println(data);
		data.add(aa);
		data.add(bb);
		System.out.println(data.size());
		int c = data.get(3);
		System.out.println(c);
		System.out.println(data.get(5));

		for (int i = 0; i < data.size(); i++) {
			System.out.println(data.get(i));
		}

		for (Integer each : data) {
			System.out.println(each);
		}

	}

}
