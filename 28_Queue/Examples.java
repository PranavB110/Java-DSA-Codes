import java.util.*;
public class Examples {
	//1. Queue using 2 stack
	public static class Queue {
		static Stack<Integer> s1 = new Stack<>();
		static Stack<Integer> s2 = new Stack<>();
		
		public static boolean isEmpty() {
			return s1.isEmpty();
		}
		
		//add - O(n)
		public static void add(int data) {
			//s1 --> s2
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			//new data in s1 as s1 is empty at this state
			s1.add(data);
			//s2 --> s1   s2 data is on new data
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
		
		//remove - O(1)
		public static int remove() {
			if(isEmpty()) {
				System.out.println("queue empty");
				return -1;
			}
			
			return s1.pop();
		}
		
		//peek - O(1)
		public static int peek() {
			if(isEmpty()) {
				System.out.println("queue empty");
				return -1;
			}
			
			return s1.peek();
		}
		
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		
		while(!q.isEmpty()) {
			System.out .println(q.peek());
			q.remove();
		}

	}

}
