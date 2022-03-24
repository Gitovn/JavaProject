package switchsatatements;

public class SwitchStatement {

	public static void main(String[] args) {
		System.out.println("Before switch");
		ascii();
		int a = 2;
		int ch = 'A';

		switch (ch) {
		case 'A':
			System.out.println("Provided character is vowel");
			break;
		case 'E':
			System.out.println("Provided character is vowel");
			break;
		case 'I':
			System.out.println("Provided character is vowel");
			break;
		case 'O':
			System.out.println("Provided character is vowel");
			break;
		case 'U':
			System.out.println("Provided character is vowel");
			break;

		case 'a':
			System.out.println("Provided character is Consonent");
			break;
		case 'e':
			System.out.println("Provided character is Consonent");
			break;
		case 'i':
			System.out.println("Provided character is Consonent");
			break;
		case 'o':
			System.out.println("Provided character is Consonent");
			break;
		case 'u':
			System.out.println("Provided character is Consonent");
			break;

		default:
			System.out.println("default code");
			break;
		}

		switch (a) {
		case 4:
			System.out.println("case 4");
			break;
		case 3:
			System.out.println("case 3");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 1:
			System.out.println("case 1");
			break;
		default:
			System.out.println("default code");
			break;
		}

		System.out.println("After switch");

	}

	public static void ascii() {
		int ch = 65;
		int a = 65;

		switch (a) {
		case 'A':
			System.out.println("Provided character is vowel");
			break;
		case 'E':
			System.out.println("Provided character is vowel");
			break;
		case 'I':
			System.out.println("Provided character is vowel");
			break;
		case 'O':
			System.out.println("Provided character is vowel");
			break;
		case 'U':
			System.out.println("Provided character is vowel");
			break;
		default:
			System.out.println("default code");
			break;

		}

		switch (ch) {
		case 'A':
			System.out.println("case 4");
			break;
		case 3:
			System.out.println("case 3");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 1:
			System.out.println("case 1");
			break;
		default:
			System.out.println("default code");
			break;
		}
		System.out.println("After switch");

	}
}
