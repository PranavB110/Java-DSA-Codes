
public class OperationsOnLinklist {
	
	public static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	
	public static Node head;
	public static Node tail;
	public static int size;
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
		 	head = tail = newNode;
			size++;
			return;
		}
        tail.next = newNode;
        tail = newNode;
        size++;
	}
	
	public void print() {
		Node temp = head;
		for(int i=0; i<size; i++) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("Null");
		System.out.println();
	}
	
	//1. search using iteration
	public int itrSearch(int key) {
		Node temp = head;
		int i = 0;
		
		while(temp != null) {
			if(temp.data == key) {
				return i;
			}
			temp = temp.next;
			i++;
		}
		return -1;
	}
    
	//2. search using recursion
	//helper fn
	public int helper(Node head, int key) {  //O(n)
		if(head == null) {
			return -1;
		}
		
		if(head.data == key) {
			return 0;
		}
		int idx = helper(head.next, key);
		if(idx == -1) {
			return -1;
		}
		
		return idx+1;
	}
	public int recSearch(int key) {   //only input bcz user just want to check, he doesnt care how. therefore helper function
		return helper(head, key);
	}
	
	//3. reverse linklist
	public void reverse() {   //O(n)
        Node prev = null;   //initial head prev is considere null
        Node curr = tail = head;
        Node next;
        
        while(curr != null) {
        	next = curr.next;
        	curr.next = prev;
        	prev = curr;
        	curr = next;
        }
        head = prev;  //curr is now null;
	}
	
	//4. delete nth ele from end
	public void deleteNthfromEnd(int n) {
		//calculate size
		int sz = 0;     //just for practice if we are giving contest how to calculate
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			sz++;
		}
		//size == value , means bydefault need to delete head
		if(n == sz) {
			head = head.next; //removeFirst
			size--;
			return;
		}
		//sz-n (other all remaining cases)
		int i=1;
		int iToFind = sz-n;
		Node prev = head;
		while(i < iToFind) {
			prev = prev.next;
			i++;
		}
		
		prev.next = prev.next.next;
		size--;                     //here we are reducing size bcz in print we have usen size variable it need to decrease
		return;
	}
	
	//5. check palindrome
	//slow fast approach
	public Node findMid(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;  //+1
			fast = fast.next.next;  //+2
		}
		return slow; //slow is my middle
	}
	
	public boolean checkPalindrome() {
		if(head == null || head.next == null) {
			return true;
		}
		//step1 - find mid
		Node midNode = findMid(head);
		//step2 - reverse 2nd half
		Node prev = null;
		Node curr = midNode;
		Node next;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;  //makes last ele of right half null
			prev = curr;
			curr = next;
		}
		
		Node right = prev;  //right half head
		Node left = head;
		
		//step3 - check left half & right half
		while(right != null) {
			if(left.data != right.data) {
				return false;
			}
			left = left.next;
			right = right.next;
		}
		return true;
	}
	
	public static void main(String[] args) {
		OperationsOnLinklist ll = new OperationsOnLinklist();
		ll.addLast(2);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(2);
		ll.addLast(1);
		ll.print();
//		System.out.println(ll.itrSearch(3));
//		System.out.println(ll.recSearch(3));
//		ll.reverse();
//		ll.print();
//		ll.deleteNthfromEnd(3);
//		ll.print();
		System.out.println(ll.checkPalindrome());
	}

}
