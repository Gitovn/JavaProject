package practise.assignments;

import java.util.Scanner;

public class PasswordDoWhile {
	
	
	public static void main(String[] args) {
		
		int pass = 123;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		int a = 0;
		boolean fl= a==pass;
		
		do
		{
			
			if(count ==0)
			{
				System.out.println("Enter your password");
			}
			
			else 
			{
				System.out.println("Your password is incorrect...please try again..");
			}
			
			a = sc.nextInt();
			
			fl = a==pass;
			count++;	
		}
		while(!fl && count<3);

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
