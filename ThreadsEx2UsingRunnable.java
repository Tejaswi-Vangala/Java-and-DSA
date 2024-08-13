package javaanddsa;
import java.lang.Runnable;
public class ThreadsEx2UsingRunnable implements Runnable{
//	ThreadsEx2UsingRunnable(String name){
//		super(name);
//	}
	public void run() {
		for(int i = 0;i<5;i++) {
				System.out.println("current Thread name: "+Thread.currentThread().getName()+"    current execution:"+i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadsEx2UsingRunnable tt1 = new ThreadsEx2UsingRunnable();
		//ThreadsEx2UsingRunnable tt2 = new ThreadsEx2UsingRunnable();
		Thread t1 = new Thread(tt1,"1st");
		Thread t2 = new Thread(tt1, "2nd" );
//		t1.setName("1st thread");
//		t2.setName("2nd thread");
		t1.start();
		//t1.join();
		t2.start();
		//t2.join();
	}

}
