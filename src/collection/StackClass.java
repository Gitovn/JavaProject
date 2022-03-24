package collection;

import java.util.Stack;

public class StackClass {
	
	public static void main(String[] args) {
		
		Stack<Integer> data = new Stack<Integer>();
		
		data.push(23);
		data.push(3);
		data.push(11);
		System.out.println(data.get(2));
		
		System.out.println(data.pop());
		data.push(34);
		data.add(33);
		data.add(56);
		data.remove(3);
		System.out.println(data);
	}

}
