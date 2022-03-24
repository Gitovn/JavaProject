package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> data = new TreeSet<Integer>();
		
		data.add(12);
		data.add(2);
		data.add(23);
		data.add(56);
		data.add(1);
		System.out.println(data);
		System.out.println(data.size());
		

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
