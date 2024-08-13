package javaanddsa;

// this is called as FUNCTIONAL INTERFACES
class WaitAndNotify2 {
	private int max;
    private int number = 1;
    private Object lock = new Object();

    WaitAndNotify2(int max) {
        this.max = max;
    }

    // Method to print even numbers
    public void printEven() {
        synchronized (lock) {
            while (number <= max) {
                if (number % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number++;
                    lock.notify(); // Notify other thread
                } else {
                    try {
                        lock.wait(); // Wait for other thread to print odd number
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    // Method to print odd numbers
    public void printOdd() {
        synchronized (lock) {
            while (number <= max) {
                if (number % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number++;
                    lock.notify(); // Notify other thread
                } else {
                    try {
                        lock.wait(); // Wait for other thread to print even number
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
public class ArrowFuncForRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaitAndNotify2 printer = new WaitAndNotify2(10);

	        // Create two threads for printing even and odd numbers
	        Thread evenThread = new Thread(() -> printer.printEven(), "EvenThread");
	        Thread oddThread = new Thread(() -> printer.printOdd(), "OddThread");

	        // Start both threads
	        evenThread.start();
	        oddThread.start();

	}

}
