
public class ObjectOrientedConcept {
	//declaring variables
	int a;
	float b;
	double c;
	//defining methods
	void method() {
		
	}
	
	int method2() {
		return 0;
	}
	 void add(int a, int b) {
		 
	 }
	 
	 int mul(int b, int c) {
		 return b * c;
	 }
	

	public static void main(String[] args) {
		//object creation
		ObjectOrientedConcept ooc = new ObjectOrientedConcept();
		//ooc is an instance or object
		//accessing variables or methods
		ooc.a = 24;
		ooc.b = 234.567f;
		ooc.c = 23456.7777d;
		System.out.println(ooc.mul(3, 4));

	}

}
