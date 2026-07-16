import java.util.*;
public class ValidParenthesis {
	
	//valid parenthesis
	public static boolean isValid(String str) { //O(n)
		Stack<Character> s = new Stack<>();
		
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			
			//opening
			if(ch == '(' || ch == '{' || ch == '[') { 
				s.push(ch);
			} else {
				//closing
				if(s.isEmpty()) {  // "}})))"
					return false;
				}
				if( (s.peek() == '(' && ch == ')')        //'()'
					|| (s.peek() == '{' && ch == '}')     //'{}'
					|| (s.peek() == '[' && ch == ']') ) { //'[]'
					    s.pop();
				} else return false;
			}
		}
		
		if(s.isEmpty()) {
			return true;
		} else {
			return false; //some opening parenthesis remaining "(({})"
		}
	}
	
	
	//Duplicate parenthesis
	public static boolean isDuplicate(String str) {  //O(n)
		Stack<Character> s = new Stack<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			//closing
			if(ch == ')') {
				int count = 0;
				while(s.peek() != '(') { //isEmpty() cndn not use bcz already valid string are present hence there will be opening parenthesis for every closing
					s.pop();
					count++;
				}
				if(count < 1) {
					return true; //duplicate exist
				} else {
					s.pop(); //opening pair
				}
			} else {
				//opening
				s.push(ch);
			}
		}
		
		return false; //if duplicate not exists
	}

	public static void main(String[] args) {
		String str = "(({[]}))";
//		System.out.println(isValid(str)); 
		
		System.out.println(isDuplicate(str));
		
	}

}
