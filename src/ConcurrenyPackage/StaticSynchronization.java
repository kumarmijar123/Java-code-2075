package ConcurrenyPackage;

class CSITBooking {
	 static int csit_seats = 48;
	 
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
	 
	 class Mythread1 extends Thread {
		  CSITBooking cb;
		  int seats;
		  
		  public Mythread1(CSITBooking cb, int seats) {
			  this.cb = cb;
			  this.seats = seats;
		  }
		  
		  @Override
		  public void run() {
			  cb.bookSeat(seats);
		  }
	 }
	 
	 class Khalti extends Thread {
		 CSITBooking cb;
		 int seats;
		 
		 public Khalti(CSITBooking cb, int seats) {
			 this.cb = cb;
			 this.seats = seats;
		 }
		 
		 @Override
		 public void run() {
			  cb.bookSeat(seats);
		 }
	 }

public class StaticSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSITBooking b1 = new CSITBooking();
		Mythread1 t1 = new Mythread1(b1, 12);
		t1.start();
		Mythread1 t2 = new Mythread1(b1, 14);
		t2.start();
		

	}

}
}
