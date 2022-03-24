package exceptions;

public class ExcClass {
	
	public static void main(String[] args) {
		
		CheckedException obj = new CheckedException();
//		obj.sample1();
		obj.sample5();
	}
	
	public static void sm()
	{
		try {
			CheckedException.sample2();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
