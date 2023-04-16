package InnerClassPackage;

abstract class Anonymous {
	
   abstract	void display();//Signature
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous ac = new Anonymous() {
			
			@Override
			void display() {
				//TODO Auto-genetatee method
				System.out.println("I am Anonymous inner class");
			}
		};
		ac.display();

	}

}
