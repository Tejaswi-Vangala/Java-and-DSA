package javaanddsa;

class Reservation_sync extends Thread{
	int available = 1;
	int wanted;
	
	Reservation_sync(int wanted){
		System.out.println("WELCOME TO INDIAN RAILWAYS RESERVATION SYSTEM");
		this.wanted = wanted;
	}
	
	public void run() {
		 
		synchronized(this) {
		
		System.out.println("Hello!, Mr/Ms." + Thread.currentThread().getName()+" available seats are " + available);
		
		if(available>=wanted) {
			System.out.println("Reservation is done for passenger with name: " + Thread.currentThread().getName());

			try {
				Thread.sleep(1000);
			}
			catch(Exception e ) {
				System.out.println("error in sleep method: " + e);
			}
			available -= wanted;
		}
		
		else {
			System.out.println("cannot provide reservation for " + Thread.currentThread().getName());
		}
		}
	}
}

public class Reservation_using_Threads_synchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reservation_sync res = new Reservation_sync(1);
		Thread t1 = new Thread(res, "ram");
		Thread t2 = new Thread(res, "siri");
		t1.start();
		t2.start();

	}

}
