package hashmappackage;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapClass2 {

	public static void main(String[] args) {
		
	HashMap<Integer, StudentHashMap> map = new HashMap<>();
	
	StudentHashMap o1 = new StudentHashMap();
	o1.rollNumber = 1;
	o1.name = "Ajay";
	StudentHashMap o2 = new StudentHashMap();
	o2.rollNumber = 2;
	o2.name = "Amit";
	
	map.put(1, o2);
	map.put(2, o1);
	map.put(3, new StudentHashMap());
	
	StudentHashMap obj = map.get(1);
	obj.displayStudentInfo();
	
	for(Entry<Integer, StudentHashMap> each : map.entrySet())
	{
		System.out.println(each.getKey());
		StudentHashMap dd = each.getValue();
		dd.displayStudentInfo();
	}

	}

}
