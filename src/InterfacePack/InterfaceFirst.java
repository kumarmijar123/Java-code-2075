package InterfacePack;


// Definition of interface
interface Test{
	void Test1();
	void Test2();
}

// Interface cant be extended.
//class My extends Test{
//	
//}

class My implements Test{
	public void Test1() {
		System.out.println("Test1 of class My.");
	}
	public void Test2() {
		System.out.println("Test2 of class My.");
	}
	
	public void Test3() {
		System.out.println("Meth3 of class My.");
	}
}
public class InterfaceFirst {

	public static void main(String[] args) {

		
		// References of interface
//		Test = new Test(); // Can't make it.
		
		Test t = new My();
		t.Test1(); // Run-time polymorphism
		t.Test2();
//		t.meth3(); // can't call due to reference
	}

}
