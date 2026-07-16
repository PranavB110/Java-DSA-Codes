import java.util.*;
public class Linkedlist {
    
	//create Node
	public static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//Define head, tail
	public static Node head;
	public static Node tail;
	public static int size;  //by default java initialize it to zero
	
	//add first
	public void addFirst(int data) {
		//step 1 = create new node using class Node
		Node newNode = new Node(data); 
		size++;
		if(head == null) {
			head=tail=newNode;
			return;
		}
		//step 2 = newNode next = head
		newNode.next = head;  //link
		//step 3 = head is newNode
		head = newNode;
	}
	
	//add Last
	public void addLast(int data) {
		Node newNode = new Node(data);
		size++;
		if(head == null) {
			head=tail=newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}
	
	//add in Middle
	public void addMiddle(int idx, int data) {
		if(idx == 0) {
			addFirst(data);
			return;
		}
		Node newNode = new Node(data);
		size++;
		int i = 0;
		Node temp = head;
		
		while(i < idx-1) {
			temp = temp.next;
			i++;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		
	}
	
	//remove 1st
	public int removeFirst() {
		if(size == 0) {
			System.out.println("LinkedList is Empty!!");
			return Integer.MIN_VALUE;
		} else if(size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		int val = head.data;
		head = head.next;
		size--;
		return val;  //deleted part
	}
	
	//remove last
	public int removeLast() {
		if(size == 0) {
			System.out.println("LinkedList is Empty!!");
			return Integer.MIN_VALUE;
		} else if(size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		//prev : i = size-2
		Node temp = head;     //temp = prev
		for(int i=0; i<size-2; i++) {
			temp = temp.next;
		}
		
		int val = temp.next.data;   //tail data = tail.data
		temp.next = null;
		tail = temp;
		size--;
		return val;
	}
	
	// Print LinkedList
	public void print() {
		if(head == null) {
			System.out.println("LinkedList is Empty!!");
		    return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"->");
			temp = temp.next;
		}
		System.out.print("NULL");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist(); //class Name = Linkedlist which we created above
		ll.print();
		ll.addFirst(1);
		ll.print();
		ll.addFirst(2);
		ll.print();
		ll.addLast(3);
		ll.print();
		ll.addLast(4);
		ll.print();
		
		ll.addMiddle(2, 9);
		ll.print();
		System.out.println(ll.size);
		ll.removeFirst();
		ll.removeLast();
		ll.print();
	}

}
