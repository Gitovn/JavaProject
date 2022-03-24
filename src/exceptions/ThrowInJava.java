package exceptions;

public class ThrowInJava {
	
	public static void main(String[] args) throws IllegalAgeException {
		
		int age = 12;
		
		if(age>=18)
		{
			System.out.println("You can vote");
			
		}
		else
		{
			throw new IllegalAgeException();
		}
	}

}
