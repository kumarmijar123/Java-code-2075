package InnerClassPackage;

class Outer {
	int a = 35;
	void display() {
		class inner {
			void print() {
				System.out.println("Value=" + a);
			}
		}
		
		inner in = new inner();
		in.print();
		
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		out.display();
        
	}

}
