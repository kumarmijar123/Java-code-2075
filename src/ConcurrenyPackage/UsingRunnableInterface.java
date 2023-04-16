package ConcurrenyPackage;

class Hello implements Runnable {//Implements Runnable interface
	@Override
	 public void run() {
        for (  int i = 0; i < 20; i++) {
	  System.out.println("Hello");
	  try {
		  Thread.sleep(1000);
	  }
	  catch (InterruptedException e) {
	  }
        }
	}
}

class Hi implements Runnable {//Implements Runnable interface
	@Override
	 public void run() {
        for (  int i = 0; i < 20; i++) {
	  System.out.println("Hi");
	  try {
		  Thread.sleep(1000);
	  }
	  catch (InterruptedException e) {
	  }
        }
	}
}

public class UsingRunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hi h = new Hi();// this is not a thread
		 Thread t1 = new Thread(h);
		 Hello he = new Hello();
		 Thread t2 = new Thread(he);
		 t1.start();
		 t2.start();

	}

}
