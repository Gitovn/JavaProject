package practise.assignments;

import java.util.Scanner;

public class FindAvgOfNumbers {

	public static void main(String[] args) {

		int a, b, avg , count = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number");

		a = sc.nextInt();
		count++;

		System.out.println("Enter 2nd number");

		b = sc.nextInt();
		count++;

		avg = (a + b) / count;

		System.out.println("Avg number is = " + avg);

	}

}
