//Operations
//1. Push O(1) - add top
//2. Pop O(1) - delete top
//3. Peek O(1) - find top element

import java.util.ArrayList;
public class StackConcepts {
	
	static class Stack {
		static ArrayList<Integer> list = new ArrayList<>();
		
		//empty
		public static boolean isEmpty() {
			return (list.size() == 0); //true, false
		}
		
		//Push-add
		public static void push(int data) {
			list.add(data);
		}
		
		//Pop-delete
		public static int pop() {
			if(isEmpty()) {
				return -1;
			}
			int top = list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		
		//peek
		public static int peek() {
			if(isEmpty()) {
				return -1;
			}
			return list.get(list.size()-1);
		}
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}

	}

}