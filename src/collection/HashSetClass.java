package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
		
	HashSet<Integer> data = new HashSet<>();
	Integer a = new Integer(555);
	
	data.add(12);
	data.add(103);
	data.add(12);
	data.add(13);
	data.add(102);
	data.add(13);
	data.add(null);
	data.add(null);
	data.add(12);
	data.add(103);
	data.add(null);
	data.add(12);
	data.add(13);
	data.add(102);
	data.add(13);
	data.add(null);
	data.add(a);
	System.out.println(data.size());
	System.out.println(data);
	data.remove(a);
	data.remove(102);
	System.out.println(data.size());
	System.out.println(data);
	

	Iterator<Integer> itr = data.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	for(Integer each : data)
	{
		System.out.println(each);
	}
	
	

	}

}
