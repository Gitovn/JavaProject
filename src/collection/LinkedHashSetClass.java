package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> data = new LinkedHashSet<Integer>();
		
		data.add(12);
		data.add(2);
		data.add(33);
		data.add(56);
		data.add(2);
		LinkedHashSet<Integer> data1 = new LinkedHashSet<Integer>();
		data1.add(12);
		data1.add(2);
		data1.add(33);
		data1.add(56);
		data1.add(2);
		System.out.println(data);
		data.remove(33);
		data1.remove(33);
		System.out.println(data.size());
		boolean ff = data.equals(data1);
		System.out.println(ff);
		
		for(Integer each : data)
		{
			System.out.println(each);
		}
		
	}

}
