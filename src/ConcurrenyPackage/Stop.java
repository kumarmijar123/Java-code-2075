package ConcurrenyPackage;

public class Stop extends Thread {
    @Override
    public void run() {
    	 for ( int  i = 0; i < 5; i++) {
    		  System.out.println(Thread.currentThread().getName());
    		  try {
    			   sleep(2000);
    			   
    		  }
    		  catch (InterruptedException e) {
    			  
    		  }
    	 }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stop t1 = new Stop();
		t1.start();
		Stop t2 = new Stop();
		t2.start();
		t2.stop(); //deprecated since 2021
		System.out.println("t2 is stopped");

	}

}
