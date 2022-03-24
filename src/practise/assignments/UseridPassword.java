package practise.assignments;

import java.util.Scanner;

import breakcontinue.ContinueClass;

public class UseridPassword {

	public static void main(String[] args) {

		userId();
		password();

	}

	public static void userId() {

	}

	public static void password() {

		Scanner sc = new Scanner(System.in);
		int password = 123;
		int count = 0;

		for (int i = 0; i <= 2; i++) {
			int a = sc.nextInt();
			System.out.println("Enter your password");

			if (a == password) {
				System.out.println("You have logged in successfully");
				break;
			}

			else {
				System.out.println("You have entered incorrect password");
				count++;

				if (count == 3) {
					System.out.println("You have reached maximum limit....try again tomorrow");
				}

			}
		}
	}

}
