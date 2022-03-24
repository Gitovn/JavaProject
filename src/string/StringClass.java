package string;

public class StringClass {

	public static void main(String[] args) {

		char ch[] = { 'a', '3', 'f' };
		String strr = new String(ch); // String object created using new keyword

		String data3 = new String("KTCTC");

		String data = "KTCTC";
		String str1 = "Welcome"; // String object created using literal
		String str3 = data;
		String str4 = "KTCTC 33";

		String str = new String("KTCTC");
		System.out.println(str);

		boolean f = data == str1;
		System.out.println(f);
		boolean f1 = data == str;
		System.out.println(f1);
		boolean f2 = data == str3;
		System.out.println(f2);

	}

}
