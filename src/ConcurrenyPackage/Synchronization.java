package ConcurrenyPackage;

public class Synchronization {

    // Synchronized method
    public synchronized void synchronizedMethod() {
        System.out.println("Starting synchronized method...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ending synchronized method...");
    }

    public void unsynchronizedMethod() {
        System.out.println("Starting unsynchronized method...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ending unsynchronized method...");
    }

    public static void main(String[] args) throws InterruptedException {
        final Synchronization synchronizationDemo = new Synchronization();

        // Using synchronized method
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizationDemo.synchronizedMethod();
            }
        });

        // Using synchronized block
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized(synchronizationDemo) {
                    System.out.println("Starting synchronized block...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Ending synchronized block...");
                }
            }
        });

        // Using unsynchronized method
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizationDemo.unsynchronizedMethod();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
    }
}
