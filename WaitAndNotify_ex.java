package javaanddsa;

class WaitAndNotify implements Runnable{
	private int currcount = 1;
	private int max;
	WaitAndNotify(int max){
		this.max = max;
	}
	void evenThread() {
		synchronized(this) {
			while(currcount <= max) {
			if(currcount%2 == 0) {
				System.out.println("current even number " + currcount + "	current thread name: " + Thread.currentThread().getName());
				currcount += 1;
				notify();
			}
			else {
				try {
					wait();
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}
			}
		}
		}
	}
	void oddThread() {
		synchronized(this) {
			while(currcount <= max) {
			if(currcount%2 != 0) {
				System.out.println("current odd number " + currcount + "	current thread name: " + Thread.currentThread().getName());
				currcount += 1;
				notify();
			}
			else {
				try {
					wait();
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}
			}
		}
		}
	}
	public void run() {
		if(Thread.currentThread().getName().equals("Even")) {
			evenThread();
		}
		else if(Thread.currentThread().getName().equals("odd")) {
			oddThread();
		}
	}
}
public class WaitAndNotify_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaitAndNotify obj  = new WaitAndNotify(10);
		Thread even = new Thread(obj, "Even");
		Thread odd  = new Thread(obj, "odd");
		even.start();
		odd.start();

	}

}
