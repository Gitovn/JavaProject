package encapsulation;

public class Students {

	private int rollNumber;
	private String Name;
	private float Marks;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {

		if (rollNumber < 0) {
			System.out.println("Negative roll numbers are not allowed");
			rollNumber = 0;
		}
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public float getMarks() {
		return Marks;
	}

	public void setMarks(float marks) {
		
		if (marks<0)
		{
			marks = 0;
			
		}
		else if (marks > 100)
		{
			marks = 100;
	
		}
		this.Marks = marks;
	}

//	public void setRollNumber(int a) {
//		this.rollNumber = a;
//
//	}
//
//	public int getRollNumber() {
//		return this.rollNumber;
//	}

}
