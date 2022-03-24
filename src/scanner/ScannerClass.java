package scanner;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		System.out.println("User entered int Number = " + a);

		float b = sc.nextFloat();
		System.out.println("User entered float Number = " + b);

		String c = sc.next();
		System.out.println("User entered String = " + c);

		String d = sc.nextLine();
		System.out.println("User entered string = " + d);

		boolean e = sc.nextBoolean();
		System.out.println("User entered Boolean = " + e);

	}

}
