
public class ConceptOfVariables {
	//types of variables
	//1. instance variables or non-static variables
	//The variables those require object of instance to be accessed.
	int num = 20;
	//2.static ro class variables
	//The variables those do not require object or instance to be accessed.
	static int num1 = 30;
	void method() {
		
	}
	static void method2() {
		
	}
	
	public static void main(String[] args) {
		ConceptOfVariables obj = new ConceptOfVariables();
		System.out.println("The number is " + obj.num);
		obj.method();
		method2();
		System.out.println("The number1 is " + num1);
	}

}
