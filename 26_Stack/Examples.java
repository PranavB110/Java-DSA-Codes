import java.util.*;
public class Examples {
	//Push ele at bottom of stack
	public static void pushAtBottom(Stack<Integer> s, int data) {
		//base case
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		//recursion -top is remember bcz every fn call has its own copy, stack frame
		int top = s.pop();
		pushAtBottom(s, data);
		s.push(top);
	}
	
	//reverse a string
	public static String reverseString(String str) {
		Stack<Character> s = new Stack<>();
		int idx = 0;
		while(idx < str.length()) {
			s.push(str.charAt(idx));
			idx++;
		}
		
		StringBuilder result = new StringBuilder("");
		while(!s.isEmpty()) {
			char curr = s.pop();  //pop bydefault returns deleted value
			result.append(curr);
		}
		
		return result.toString();
	}
	
	//reverse a stack
	public static void reverseStack(Stack<Integer> s) {
		//base case
		if(s.isEmpty()) {
			return;
		}
		
		int top = s.pop();
		reverseStack(s);
		pushAtBottom(s, top);
	}
	
	//stock span problem
	public static void stockSpan(int stocks[], int span[]) {
		Stack<Integer> s = new Stack<>();
		span[0] = 1;
		s.push(0);
		
		for(int i=1; i<stocks.length; i++) {
			int currPrice = stocks[i];
			while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
				s.pop();
			}
			if(s.isEmpty()) {
				span[i] = i+1;
			} else {
				int prevHigh = s.peek();
				span[i] = i - prevHigh;
			}
			
			s.push(i);
		}
	}
	
	public static void print(Stack<Integer> s) {
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		//push at bottom
//		pushAtBottom(s, 4);
//		print(s);
		
		//reverse string
//		String str = "abc";
//		String result = reverseString(str);
//		System.out.println(result);
		
		//reverse stack
//		reverseStack(s);
//		print(s);
//		
		int stocks[] = {100, 80, 60, 70, 60, 85, 100};
		int span[] = new int[stocks.length];
		stockSpan(stocks, span);
		
		for(int i=0; i<span.length; i++) {
			System.out.println(span[i]+" ");
		}
	}

}
