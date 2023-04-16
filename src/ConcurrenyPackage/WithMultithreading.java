package ConcurrenyPackage;

class Good1 extends Thread {
	@Override
	 public void run() {
        for (  int i = 0; i < 10; i++) {
	  System.out.println("Good");
	  try {
		  Thread.sleep(1000);
	  }
	  catch (InterruptedException e) {
	 //1 second
}
	 }
}
class Morning1 extends Thread {
	public void run() {
		
       for (  int i = 0; i < 10; i++) {
	  System.out.println("Morning");
	  try {
		  Thread.sleep(1000);
	  }
	  catch (InterruptedException e) {
		  
	  }
	  //1 second
	  
       }
	 }
}

public class WithoutMultithreading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Good1 g = new Good1();
		g.start();//10 seconds
		Morning1 m = new Morning1();
		m.start();//10 seconds

	}

}