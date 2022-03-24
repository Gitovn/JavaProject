package exceptions;

public class UncheckedExceptions {

	static UncheckedExceptions obj;
	int a;

	public static void main(String[] args) {
		
		String abcd = "KTCTC";
		char ch = abcd.charAt(8848);
		
		int[] arr = { 33,43 ,443 , 43};
		System.out.println(arr[34984]);
		
		String str = "qoer";
		int z = Integer.parseInt(str);

		String data = null;
		obj.sm();

		int a = 78;
		int b = 0;

		int c = a / b;
		System.out.println(c);
		System.out.println("After exception");

	}

	public void sm() {

	}

}
