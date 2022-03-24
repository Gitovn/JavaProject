package constructors;

public class Student {
	int rollNo;
	String stName;
	
	
	public Student(int a ,String name)
	{
		Student obc = new Student();
		obc.rollNo = 76;
		obc.displayStudentInfo(); 
		rollNo = a;
		stName = name;
		System.out.println("Inside parameterized constructor");
	}
	
	public Student()
	{
		System.out.println("Inside default constructor");
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		Student obj2 = new Student(45, "Ajay");
		obj.displayStudentInfo();
		obj2.displayStudentInfo();
		
	}
	
	public void displayStudentInfo()
	{
		System.out.println("Roll Num " + rollNo);
		System.out.println("Nmae of student "+ stName);
		
	}

}
