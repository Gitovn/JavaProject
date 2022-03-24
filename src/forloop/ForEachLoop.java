package forloop;

public class ForEachLoop {

	public static void main(String[] args) {
		System.out.println("Before for loop");

		char ch[] = { 'a', 'v', 'e', 'g', 'r', 'w', 't' };
		int intarr[] = { 12, 32, 56, 87, 23, 654 };

		for (char each : ch) {
			System.out.println(each);

		}

		for (int each : intarr) {
			System.out.println(each);

		}

		System.out.println("After for each loop");
	}

}
