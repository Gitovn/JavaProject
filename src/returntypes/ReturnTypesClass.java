package returntypes;

public class ReturnTypesClass {

	public static void main(String[] args) {

		int arr[] = getintarray();
		System.out.println(arr[2]);
		for (int each : arr) {
			System.out.println(each);
		}

		int d = sm1();
		System.out.println(d);
		sm();
		sm1();
		
		System.out.println(sm1());
		ReturnTypesClass obj = new ReturnTypesClass();
		
		char chh = obj.sm3();
		System.out.println(chh);
		
		char ch = sm4();
		System.out.println(ch);

	}

	public static void sm() {
		System.out.println("Sample");
	}

	public static int sm1() {
		System.out.println("Sample 1");
		return 45;

	}

	public char sm3() {
		char ch = 'd';
		return ch;

	}

	public static char sm4() {
		char ch = 'd';
		return 60;

	}

	public static String getemail() {
		String email = "abc@gmail.com";
		return email;

	}

	public static int[] getintarray() {
		int arr[] = { 33, 55, 3 };
		return arr;
	}
}
