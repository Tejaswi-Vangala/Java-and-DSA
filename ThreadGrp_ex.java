package javaanddsa;

class ThreadGrp implements Runnable{
	public void run() {
		System.out.println("in run method: " + Thread.currentThread().getName()+"	" +  Thread.currentThread().getThreadGroup());
	}
}

public class ThreadGrp_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGrp t = new ThreadGrp();
		ThreadGroup tg = new ThreadGroup("parent Thread Group");
		
		Thread t1 = new Thread(tg, t, "first thread");
		Thread t2 = new Thread(tg, t, "second thread");
		Thread t3 = new Thread(tg, t, "third thread");
		
		System.out.println(tg.activeCount());
		
		
		t1.start();
		t2.start();
		System.out.println(tg.activeGroupCount());
		t3.start();
		tg.list();
		System.out.println(tg.activeCount());
		

	}

}



