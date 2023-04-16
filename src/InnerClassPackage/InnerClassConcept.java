package InnerClassPackage;

public class InnerClassConcept {
	
	private int a = 100;
	 public void display() {
		 
	 }
	 
	 class Inner {//member inner class
		 void access() {
			 System.out.println(a);
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClassConcept oc = new InnerClassConcept();
		InnerClassConcept.Inner in = oc.new Inner();
		in.access();

	}

}
