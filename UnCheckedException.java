package javaanddsa;

public class UnCheckedException {
	static void add(int a, int b) throws ArithmeticException, Exception{
		try {
			//Integer.parseInt("Twenty Two");
			System.out.println("a/b: " + a/b);
			
		}
		catch(ArithmeticException ae){
			throw ae;
		}
		catch(Exception e ) {
			throw e;
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			add(5,0);
		}
		catch(ArithmeticException a) {
			System.out.println("exception is " + a);
		} 
		catch(Exception e ) {
			System.out.println("2nd exception is " + e);
		}
		finally {
			System.out.println("execution done...Bye");
		}

	}

}