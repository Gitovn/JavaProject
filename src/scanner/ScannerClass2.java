package scanner;

import java.util.Scanner;

public class ScannerClass2 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("User entered First Number = " + a);
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		System.out.println("User entered Second Number = " + b);
		
		int c = a+b;
		System.out.println("Addition is = " + c);


	}

}
