package hashmappackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String[] args) {
		
		HashMap<Integer, String> data = new HashMap<>();
		
		data.put(1, "Amit");
		data.put(2, "ajay");
		data.put(23, "Sanket");
		data.put(null, "ABCD");
		data.put(45, null);
		data.put(33, null);
		data.put(1, "Sam");
		
		System.out.println(data);
		String rr = data.get(23);
		System.out.println(rr);
		data.remove(2);
		System.out.println(data);
		
		for(Entry<Integer, String> each : data.entrySet())
		{
			Integer a = each.getKey();
			String str = each.getValue();
			System.out.println(a);
			System.out.println(str);
		}
		

	}

}
