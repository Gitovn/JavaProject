package enumdata;

public class EnumClass {

	public enum workingDays {
		Mon, Tue, Wed, Thu, Fri, Sat
	};

	public enum yearOfEngg {
		Firstyear, Secondyear, Thirdyear, Forthyear
	};

	public static void main(String[] args) {

		int a = 8;
		System.out.println(Colors.Red);
		System.out.println(workingDays.Mon);
		System.out.println(yearOfEngg.Forthyear);

		yearOfEngg abcd = yearOfEngg.Firstyear;

		getYearOfStudent(abcd);
		
		for(yearOfEngg each : yearOfEngg.values())
		{
			System.out.println(each);
		}

	}

	public static void getYearOfStudent(yearOfEngg veri) {
		switch (veri) {
		case Firstyear:
			System.out.println("You ara first year student");
			break;

		case Secondyear:
			System.out.println("You are second year student");
			break;

		case Thirdyear:
			System.out.println("You are third year student");
			break;

		default:
			System.out.println("You are forth year student");
			break;
		}

	}

}
