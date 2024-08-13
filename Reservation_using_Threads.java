package javaanddsa;
import java.lang.Thread;

class Reservation extends Thread{
	int available = 1;
	int wanted;
	
	Reservation(int wanted){
		this.wanted = wanted;
	}
	
	public void run() {
		System.out.println("available seats are " + available + Thread.currentThread().getName());
		//even if we dont use try blk, it shows available as 1 for both, but cant provide reservation for one of them.
		if(available>=wanted) {
			System.out.println("Reservation is done for passenger with name: " + Thread.currentThread().getName());
//			if we use try blk, res is done for both.as thread 1 waits for some time
//			try {
//				Thread.sleep(1000);
//			}
//			catch(Exception e ) {
//				System.out.println("error in sleep method: " + e);
//			}
			available -= wanted;
		}
		
		else {
			System.out.println("cannot provide reservation for "+ Thread.currentThread().getName());
		}
	}
}

public class Reservation_using_Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reservation res = new Reservation(1);
		Thread t1 = new Thread(res, "ram");
		Thread t2 = new Thread(res, "phani");
		t1.start();
		t2.start();

	}

}
