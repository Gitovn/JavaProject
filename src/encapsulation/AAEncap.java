package encapsulation;

public class AAEncap {

	public static void main(String[] args) {

		Students obj = new Students();
		Students obj1 = new Students();

		obj.setMarks(110);
		System.out.println(obj.getMarks());

		obj.setMarks(-45);
		System.out.println(obj.getMarks());

		obj.setRollNumber(-19);
		System.out.println(obj.getRollNumber());

		obj.setName("Sumit");
		obj.setMarks(44.5f);
		obj.setRollNumber(1);
		System.out.println(obj.getMarks());

		String name = obj.getName();
		System.out.println(name);
		System.out.println(obj.getRollNumber());

		obj.setRollNumber(88);
		// obj.rollNumber = 33;
		System.out.println(obj.getRollNumber());
		System.out.println(obj1.getRollNumber());

	}

}
