package practise.assignments;

import java.util.Scanner;

public class PasswordWhile {
	
	
	public static void main(String[] args) {
		
		int pass = 233;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password");
		int a = sc.nextInt();
		boolean fl= a==pass;
		
		while(!fl && count<2)
		{
			System.out.println("Your password is incorrect....please try again");
			
			int aa = sc.nextInt();
			fl = aa==pass;
			count++;
			
		}
		
		if(fl)
			
		{
			System.out.println("You are logged in successfully");
		}
		
		else 
		{
			System.out.println("You have reached max attempts today ....please try tomorrow");
		}
	}

}
