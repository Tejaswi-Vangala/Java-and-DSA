package javaanddsa;

public class Single_LinkedList {
	Node head;
	private int size;

	public Single_LinkedList() {
		// TODO Auto-generated constructor stub
		this.size = 0;
	}
	class Node{
		String data;
		Node next;
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
	}
	//add-first
	public void addFirst(String data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
	}
	
	//add-last
	public void addLast(String data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
			return;
		}
		Node curr = head;
		while(curr.next != null) {
			curr = curr.next;	
		}
		curr.next = newnode;
		
	}
	
	//delete-first
	public void deleteFirst() {
		if(head == null) {
			System.out.println("empty list.");
			return;
		}
		size--;
		head = head.next;
	}
	
	//delete-last
	public void deleteLast() {
		if(head==null) {
			System.out.println("empty list.");
			return;
		}
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		Node secondlast = head;
		Node last = head.next;
		while(last.next != null) {
			last = last.next;
			secondlast = secondlast.next;
			
		}
		secondlast.next = null;
	}
	
	//printing-list
	public void printList() {
		Node curr = head;
		if(head == null) {
			System.out.println("nothing to print! empty list.");
			return;
		}
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr  = curr.next;
		}
		System.out.println("null");
	}
	
	//get-size
	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Single_LinkedList node1 = new Single_LinkedList();
		node1.addFirst("first added:Good morning");
		node1.printList();
		node1.addLast("added last:bye");
		node1.printList();
		System.out.println(node1.getSize());
		node1.addFirst("heyy");
		node1.addFirst("hellooooo");
		node1.addLast("ok byeeeee byeeeee");
		node1.printList();
		node1.deleteFirst();
		node1.printList();
		node1.deleteLast();
		node1.printList();
		System.out.println(node1.getSize());

	}

}
