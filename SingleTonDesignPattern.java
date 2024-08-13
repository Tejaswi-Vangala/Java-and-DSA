package javaanddsa;

public class SingleTonDesignPattern {
	private static SingleTonDesignPattern obj;
	private SingleTonDesignPattern() {}
	public static SingleTonDesignPattern getInstance() {
		if(obj==null) {
			obj = new SingleTonDesignPattern();
		}
		
		return obj;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTonDesignPattern o1 = SingleTonDesignPattern.getInstance();
		SingleTonDesignPattern o2 = SingleTonDesignPattern.getInstance();
		
		if(o1==o2)
			System.out.println("both objects are same");
		
		else
			System.out.println("both objects are different");

	}

}

