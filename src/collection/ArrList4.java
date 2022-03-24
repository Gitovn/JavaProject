package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrList4 {

	static String aa;
	static String bb;
	int arrInt = 78;

	public static void main(String[] args) {

		ArrayList<ArrList3> data = new ArrayList<>();
		ArrList3 o1 = new ArrList3();
		o1.arrInt = 11;
		ArrList3 o2 = new ArrList3();
		o2.arrInt = 56;

		data.add(o1);
		data.add(o2);
		data.add(new ArrList3());
//		data.add("Hello");

		ArrList3 ab = data.get(2);
		System.out.println(ab.arrInt);
		System.out.println(data.get(1).arrInt);

	}

	public void sm() {
		System.out.println("HI");
	}

}
