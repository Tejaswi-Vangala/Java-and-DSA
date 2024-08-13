package javaanddsa;

import java.util.Scanner;

public class Arrays_ex {
	static class Student {
		String name;
		int age;
		Student(String name,int age){
			this.name = name;
			this.age = age;
		}
		
	}
	public static void main(String[] args) {
		
		Student[] arr = new Student[2];
		
		Student s1 = new Student("kishore", 12);
		arr[0] = new Student("ram",10);
		arr[1] = new Student("krish",11);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].name+" " + arr[i].age);   //arr[i] = obj;
		}
		//jagged arrays		
		Scanner sc=new Scanner(System.in);
		int[][] jag_arr = new int[3][];
		jag_arr[0] = new int[2];
		jag_arr[1] = new int[3];
		jag_arr[2] = new int[1];
		for(int i=0;i<jag_arr.length;i++) {
			for(int j=0;j<jag_arr[i].length;j++) {
				jag_arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<jag_arr.length;i++) {
			for(int j=0;j<jag_arr[i].length;j++) {
				System.out.print(jag_arr[i][j]+" ");
			}
			System.out.println();
				
				
		}		
				
				
				
				
				
				
				
				
				
				
				
		// TODO Auto-generated method stub
//		int arr[] = {1,3,2};
//		//ArrayList<Integer> al = new ArrayList<>();
//		Scanner sc=new Scanner(System.in);
//		System.out.println(arr[2]);
//		System.out.println(arr.length);
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//		Arrays.sort(arr);
//		for(int x:arr) {
//			System.out.println(x);
//		}
//		int[][] mat = new int[3][2];
//		//4*3*2 size
//		for(int i=0;i<mat.length;i++) {
//			for(int j=0;j<mat[0].length;j++) {
//				mat[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<mat.length;i++) {
//			for(int j=0;j<mat[0].length;j++) {
//				System.out.print(mat[i][j]+" ");
//			}
//			System.out.println();
		
	
		
	}

}
