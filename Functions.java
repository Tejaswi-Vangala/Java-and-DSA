package javaanddsa;

public class Functions {
	static int add1(int a, int b) {
		return a+b;
	}
	static int[] returnArray() {
		int[] arr = {1,2,3};
		int[] arr1 = new int[] {1,2,3};
	
		return new int[] {5,4,6};
	}
	static void add2(int a,int b) {
		System.out.println(a+b);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int res= add1(2,3);
		System.out.println(add1(2,3));
		add2(5,4);
		int[] result = returnArray();
		for(int x:result) {
			System.out.println(x);
		}
		

	}

}
