package classobject;

public class AClassObject {

	public static void main(String[] args) {
		HumanBeing obj1 = new HumanBeing();
		HumanBeing obj2 = new HumanBeing();
		
		obj1.name = "Priya";
		obj1.age = 33;
		obj1.Hobby = "Playing";
		
		System.out.println(obj1.name);
		System.out.println(obj1.veg);
		
		obj1.isHumanvegetarian();
		obj1.hobbyOfHumanBeing();
		obj1.humanCanRun();
		
		obj2.name = "onkar";
		obj2.veg = true;
		obj2.Hobby = "Travelling";
		
		System.out.println(obj2.Hobby);
		System.out.println(obj2.veg);
		

	}

}
