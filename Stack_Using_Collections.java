package javaanddsa;
import java.util.*;


public class Stack_Using_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s = new Stack<>();
		s.push("hello");
		s.push("hai");
		s.push("hi");
		s.push("bye-bye");
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.search("hai"));
		System.out.println(s.size());
		System.out.println(s.contains("hi"));
		
		
		
	}

}
