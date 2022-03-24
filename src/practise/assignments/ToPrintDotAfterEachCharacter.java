package practise.assignments;

public class ToPrintDotAfterEachCharacter {

	public static void main(String[] args) {

		String name = "Onkar";

		char cName[] = name.toCharArray();
		for (char each : cName) {
			System.out.print(each);
			System.out.print(".");
		}
	}

}
