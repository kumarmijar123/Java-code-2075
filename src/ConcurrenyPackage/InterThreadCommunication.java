package ConcurrenyPackage;

class TotalEarnings extends Thread {
	int total = 0;
	@Override
	public void run() {
		int totalseats = 48;
		for(int i = 0; i < totalseats; i++) {
			total += 100000;
		}
		this.notify(); //lock is released
	}
	
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		TotalEarnings te = new TotalEarnings();
		te.start();
		System.out.println("Total Earnings: " + te.total + " rs ");

	}

}
