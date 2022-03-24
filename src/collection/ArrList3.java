package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrList3 {

	static String aa;
	static String bb;
	int arrInt = 78;

	public static void main(String[] args) {

		Object[] ar = new Object[3];

		ar[0] = "Hello KTCTC";
		ar[1] = 45;
		ar[2] = new ArrList3();

		ArrList3 dd = (ArrList3) ar[2];
		System.out.println(dd.arrInt);

		ArrList3 obj = new ArrList3();
		obj.arrInt = 100;

		ArrayList<Object> data = new ArrayList<>();

		Object c = "data";
		Object d = new ArrList3();

		data.add("KTCTC");
		data.add(45);
		data.add(new ArrList3());
		data.add(obj);
		System.out.println(data);
		ArrList3 bgt = (ArrList3) data.get(3);
		System.out.println(bgt.arrInt);

	}

	public void sm() {
		System.out.println("HI");
	}

}
