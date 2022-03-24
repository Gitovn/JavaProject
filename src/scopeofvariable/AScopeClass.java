package scopeofvariable;

public class AScopeClass {

	public static void main(String[] args) {
		
		VariableScopeClass obj = new VariableScopeClass();
		obj.a =33;
		obj.pqr = 30;
		VariableScopeClass.pqr = 44;
		obj.sampleMethod1(52);
		

	}

}
