package javaanddsa;

import java.io.*;

class Withdraw extends Exception{
	
	Withdraw(String message){
		super(message);
	}
	
}

public class CustomException {
	public static void balCheck(int amount,int bal) throws Withdraw{
		if(amount<=bal) {
			System.out.println("withdraw successfull");
			bal -= amount;
			System.out.println("Remaining balance is "+ bal);
		}
		else
			throw new Withdraw("Insufficient Balance");
	}
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		int bal = 50000;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
        int amount = Integer.parseInt(input);
		try {
		balCheck(amount,bal);
		}
		catch(Withdraw w){
			System.out.println("bal Exception --> "+w);
		}

	}

}
