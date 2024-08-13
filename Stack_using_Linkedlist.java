package javaanddsa;

public class Stack_using_Linkedlist {
	static  class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	 static class Stack{
		 static Node top;
		  boolean isEmpty() {
			  if(top == null)
				  return true;
			  return false;
		  }
		  void push(int data) {
			  Node newn = new Node(data);
			  if(isEmpty())
			  {
				  top = newn;
				  return;
			  }
			  newn.next = top;
			  top = newn;
		  }
		  int pop() {
			  if(isEmpty()) {
				  return -1;
			  }
			  int data = top.data;
			  top = top.next;
			  return data;
		  }
		  int peek() {
			  if(isEmpty()) {
				  return -1;
				  
			  }
			  return top.data;
		  }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		s.push(8);
		s.push(10);
		s.push(11);
		System.out.println(s.peek()); 
		System.out.println(s.pop());
		System.out.println(s.peek()); 
	}

}
