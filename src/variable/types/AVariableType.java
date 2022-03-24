package variable.types;

public class AVariableType {

	public static void main(String[] args) {
		StaticVariableTypeClass.flag = true;
		System.out.println(StaticVariableTypeClass.flag);
		StaticVariableTypeClass.staticSimpleMethod();

		StaticVariableTypeClass obj = new StaticVariableTypeClass();
		obj.name = "abhi";
		obj.flag = false;
		obj.nonStaticSimpleMethod();
		obj.staticSimpleMethod();

	}

}
