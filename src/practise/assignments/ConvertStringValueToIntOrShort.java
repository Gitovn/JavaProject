package practise.assignments;

public class ConvertStringValueToIntOrShort {

	public static void main(String[] args) {
		
		String value = "354";
		
		int a = Integer.parseInt(value);
		System.out.println(a);
		
		int b = Integer.valueOf(value);
		System.out.println(b);
		
		short bb = Short.parseShort(value);
		System.out.println(bb);
		
		short c = Short.valueOf(value);
		System.out.println(c);

	}

}
