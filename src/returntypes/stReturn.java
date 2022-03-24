package returntypes;

public class stReturn {
	
	int rollno;
	String name;
	
	public void printStInfo()
	{
		System.out.println("Students roll no = " + rollno);
		System.out.println("Students name = "+ name);
		
	}
		
	public static void main(String[] args) {
		stReturn object = getStudentObject();
		System.out.println(object.rollno);
		object.printStInfo();
		
		int a = dd();
		System.out.println(a);
	}
	
	public static stReturn getStudentObject()
	{
		stReturn obj = new stReturn();
		obj.rollno = 45;
		obj.name = "Ajay";
		
		obj.printStInfo();
		return obj;
		
	}
	
	public static int dd()
	{
		int a = 49;
		if(a>30)
		{
			return 44;
		}
		
		else if(a>40)
		{
			return 50;
		}
		return 49;
	}

}
