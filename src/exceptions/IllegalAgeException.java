package exceptions;

public class IllegalAgeException extends Exception {
	
	public IllegalAgeException()
	{
		super("Your age is not legal for voting in india");
	}

}
