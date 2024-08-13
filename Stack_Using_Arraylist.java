package javaanddsa;
import java.util.*;

public class Stack_Using_Arraylist {
	static class Stack{
	static ArrayList<Integer> arr  = new ArrayList<>();
	 boolean isEmpty() {
		return arr.size()==0?true:false;
	}
	
	void push(int data)
	{
		arr.add(data);
	}
	 int peek() {
		if(isEmpty()) {
			return -1;
		}
		return arr.get(arr.size()-1);
	}
	 int pop() {
		if(isEmpty()) {
			return -1;
			
		}
		int p = arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		return p;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(50);
		s.push(85);
		s.push(701);
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.peek());
		

	}

}
