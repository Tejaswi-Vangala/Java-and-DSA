package javaanddsa;

public class ThreadPriority extends Thread {

	public ThreadPriority(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	public void run() {
		System.out.println("inside run method for thread - " + Thread.currentThread().getName() + "   priority of thread is " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority t1 = new ThreadPriority("first thread");
		ThreadPriority t2 = new ThreadPriority("second thread");
		ThreadPriority t3 = new ThreadPriority("third thread");
		ThreadPriority t4 = new ThreadPriority("fourth thread");
		ThreadPriority t5 = new ThreadPriority("fifth thread");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t4.setPriority(4);
		System.out.println(t1.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
