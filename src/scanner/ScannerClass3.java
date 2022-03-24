package scanner;

import java.util.Scanner;

public class ScannerClass3 {

	public static void main(String[] args) {

		int password = 12345;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == password) {
			System.out.println("You have logged in successfully");
		} else {
			System.out.println("Password is wrong .........Try again");

		}
	}

}
