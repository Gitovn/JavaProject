package forloop;

public class ForLoopClass2 {

	public static void main(String[] args) {
		System.out.println("Before for loop");

		char ch[] = { 'a', 'v', 'e', 'g', 'r', 'w', 't' };
		boolean flag = true;

		for (int i = ch.length - 1; i >= 0; i--) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				System.out.println("Vowel is present");
			}

		}

		System.out.println("-------------------------------------------------");

		for (int i = 0; flag; i++) {

			System.out.println("Inside for loop " + i);
			if (i == 5) {
				flag = false;
			}

		}

		System.out.println("-------------------------------------------------");

		for (int i = ch.length; i > 0; i--) {

			System.out.println(ch[i - 1]);
		}

		System.out.println("-------------------------------------------------");

		for (int i = 0; i < ch.length; i++) {

			System.out.println(ch[i]);
		}

		System.out.println("After for loop");
	}

}
