
package ConcurrenyPackage;

class CSITBookingSystem {
 int csit_seats = 48;
 
 public synchronized void bookSeat(int seats) {
	 if (csit_seats >= seats) {
		  System.out.println(seats + " seats are booked successfully");
		  csit_seats = csit_seats - seats;
		  System.out.println(csit_seats + " seats are availabe");
	 }
	 else {
		  System.out.println(seats + " seats are not available.");
		  System.out.println(csit_seats + " seats are available");
	 }
 }

public class WithoutSynchronization extends Thread {
	
	static CSITBookingSystem sbs;
	int seats;
	@Override
	
	public void run() {
		sbs.bookSeat(seats);
	}

	public static void main(String[] args) {

		sbs = new CSITBookingSystem();
		WithoutSynchronization kumar = new WithoutSynchronization();
		kumar.seats = 15;
		kumar.start();

	}

}
