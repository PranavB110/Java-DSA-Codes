// implementing stack using linklist with help java collection FRAMEWORK
//stack
//push(), pop(), peek(), isEmpty()
import java.util.*;
public class StkLinkListColtionFramework {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}

	}
}
