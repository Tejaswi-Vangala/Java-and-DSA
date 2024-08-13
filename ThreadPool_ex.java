package javaanddsa;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;

class ThreadPool implements Runnable{
	String msg;
	ThreadPool(String msg){
		this.msg = msg;
	}
	public void run() {
		System.out.println("start of thread: " + Thread.currentThread().getName() + "	msg is " + msg);
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of thread: " + Thread.currentThread().getName() + "	msg is " + msg);
	}
}

public class ThreadPool_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// these are present in java.util.concurrent package - must be imported
		ExecutorService executor = Executors.newFixedThreadPool(5);
		//ExecutorService executor = Executors.newCachedThreadPool(); - creates threadpool that creates new threads as needed
		for(int i = 0;i<10; i++) {
			Runnable r = new ThreadPool(" " + i);
			executor.submit(r);
			
		}
		executor.shutdown();
		while(!executor.isTerminated()) {}
		System.out.println("Finished all threads");  
		

	}

}
