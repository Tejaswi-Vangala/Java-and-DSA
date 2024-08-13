package javaanddsa;
import java.lang.Thread;

public class Threads extends Thread{
	Threads(String name){
		super(name);
	}
	public void run() {
		
		for(int i = 0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("current Thread name: "+Thread.currentThread().getName()+"    current execution:"+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads t1 = new Threads("first thread ");
		Threads t2 = new Threads("second thread");
		
		t1.start();
		t2.start();
		
	}

}
