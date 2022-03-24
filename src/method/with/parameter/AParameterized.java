package method.with.parameter;

public class AParameterized {

	public static void main(String[] args) {
		ParameterizedClass.addition(10, 10.42f);
		ParameterizedClass obj = new ParameterizedClass();
		obj.multiplication(1.5f, 3);
		ParameterizedClass.substraction(65, 13);
		obj.division(12, 60);

	}

}
