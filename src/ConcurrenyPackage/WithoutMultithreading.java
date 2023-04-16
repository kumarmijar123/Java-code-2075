package ConcurrenyPackage;

class Good {
	 void display() throws InterruptedException {
		 
	 
        for (  int i = 0; i < 10; i++) {
	  System.out.println("Good");
	  Thread.sleep(1000);//1 second
}
	 }
}
class Morning {
	 void display() throws InterruptedException {
		 
	 
       for (  int i = 0; i < 10; i++) {
	  System.out.println("Morning");
	  Thread.sleep(1000);//1 second
       }
	 }
}

public class WithoutMultithreading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Good g = new Good();
		g.display();//10 seconds
		Morning m = new Morning();
		m.display();//10 seconds

	}

}

