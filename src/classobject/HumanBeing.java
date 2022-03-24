package classobject;

public class HumanBeing {

	String name;
	int age;
	String Hobby = "cricket";
	float weight;
	boolean veg;

	public static void main(String[] args) {
		HumanBeing ganesh = new HumanBeing();
		HumanBeing sandhya = new HumanBeing();

		ganesh.name = "Ganesh";
		ganesh.age = 35;
		ganesh.weight = 44.6f;
		ganesh.veg = true;

		ganesh.updateState();

		int ab = ganesh.age;
		String ss = ganesh.name;
		System.out.println(ganesh.name);
		System.out.println(ganesh.age);
		System.out.println(ganesh.weight);
		System.out.println(ganesh.veg);
		System.out.println(ab);
		System.out.println(ss);

		sandhya.name = "KTCTC";
		sandhya.age = 55;
		sandhya.Hobby = "Ludo";

		System.out.println(sandhya.name);
		System.out.println(sandhya.age);
		System.out.println(sandhya.weight);
		System.out.println(sandhya.veg);

		ganesh.isHumanvegetarian();
		ganesh.humanCanRun();
		sandhya.isHumanvegetarian();
		sandhya.hobbyOfHumanBeing();
	}

	public void humanCanTalk() {

		System.out.println("Human being can talk");

	}

	public void humanCanRun() {

		System.out.println("Human being can run");

	}

	public void isHumanvegetarian() {
		System.out.println(veg);
	}

	public void hobbyOfHumanBeing() {
		System.out.println(Hobby);
	}

	public void updateState() {

		Hobby = "Tennis";
	}

}
