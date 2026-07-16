import java.util.*;
public class WordBreakProblem {
	static class Node {
		Node children[] = new Node[26];
		boolean eow = false;
		
		public Node() {
			for(int i=0; i<children.length; i++) {
				children[i] = null;
			}
		}
	}
	
	public static Node root = new Node();
	
	//insert
	public static void insert(String word) {
		Node curr = root;
		for(int level=0; level<word.length(); level++) {
			int idx = word.charAt(level) - 'a';
			if(curr.children[idx] == null) {
				curr.children[idx] = new Node();
			}
			curr = curr.children[idx];
		}
		
		curr.eow = true;
	}
	
	//delete
	public static boolean search(String word) {
		Node curr = root;
		for(int level=0; level<word.length(); level++) {
			int idx = word.charAt(level) - 'a';
			if(curr.children[idx] == null) {
				curr.children[idx] = new Node();
			}
			curr = curr.children[idx];
		}
		
		return curr.eow == true;
	}
	
	public static boolean wordBreak(String key) {
		if(key.length() == 0) {  // 2nd part length is zero so 1st part is only to check second return true if 1st not present then false
			return true;
		}
		for(int i=1; i<=key.length(); i++) {  //start from 1 bcz at initial part substring[0,0) is not valid therefor[0,1) 1 is not included
			if(search(key.substring(0, i)) && wordBreak(key.substring(i))) {  //substring(i) bydefalult substr(i, end)
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
		for(int i=0; i<arr.length; i++) {
			insert(arr[i]);
		}
		
		String key = "ilikesmasung";
		System.out.println(wordBreak(key));

	}

}
