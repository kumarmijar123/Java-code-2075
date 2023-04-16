package ConcurrenyPackage;

public class Yield extends Thread {
	@Override
	public void run() {//Thread-0
		Thread.yield();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " in control");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for (int i = 0; i < 5; i++)
		//{
		//	System.out.println(Thread.currentThread().getName() + " in control");
		//}
		Yield y = new Yield();
		y.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " in control");
		}

	}

}
