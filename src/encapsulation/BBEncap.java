package encapsulation;

public class BBEncap {

	public static void main(String[] args) {

		Students obj = new Students();

		obj.setMarks(55.3f);
		obj.setName("Ajay");
		obj.setRollNumber(2);

		generateStudentRecords(obj);

	}

	public static void generateStudentRecords(Students oo) {
		System.out.println(oo.getMarks());
		System.out.println(oo.getName());
		System.out.println(oo.getRollNumber());

	}

}
