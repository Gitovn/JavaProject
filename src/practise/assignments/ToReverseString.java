package practise.assignments;

public class ToReverseString {

	public static void main(String[] args) {
	
		String str = "India is my country";
		
		//reverse string using String buffer
		
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println(sbr);
		
		//reverse string using for loop
		
		String reverseStr = "";
		for(int i=str.length()-1 ; i>=0 ; i--)
		{
			reverseStr = reverseStr + str.charAt(i);	
		}
		System.out.println(reverseStr);
		
	}

}
