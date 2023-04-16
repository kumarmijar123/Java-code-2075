package ConcurrenyPackage;

public class ThreadDemo implements Runnable {

    Thread thread;

    public ThreadDemo() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            // Using sleep() method
            System.out.println("Thread " + Thread.currentThread().getName() + " is sleeping for 2 seconds.");
            Thread.sleep(2000);

            // Using stop() method
            System.out.println("Thread " + Thread.currentThread().getName() + " is stopping.");
            Thread.currentThread().stop();

            // Using yield() method
            System.out.println("Thread " + Thread.currentThread().getName() + " is yielding.");
            Thread.yield();

            // Using wait() and notify() methods
            synchronized(this) {
                System.out.println("Thread " + Thread.currentThread().getName() + " is waiting.");
                wait();
                System.out.println("Thread " + Thread.currentThread().getName() + " has been notified.");
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + Thread.currentThread().getName() + " interrupted.");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo threadDemo = new ThreadDemo();

        // Using notify() method
        synchronized(threadDemo) {
            System.out.println("Main thread is notifying waiting threads.");
            threadDemo.notify();
        }
    }
}

