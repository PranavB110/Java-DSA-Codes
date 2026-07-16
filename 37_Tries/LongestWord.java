// check which word in array is the longest who has all his prefixes in the array itself provided
//if length of 2 words whose all prefix are present are same in such case go lexicographically (priority alphabetically)
public class LongestWord {
	
	static class Node {
		Node children[] = new Node[26];
		boolean eow = false;   //end of word
		
		Node() {
			for(int i=0; i<26; i++) { //initially all is null
				children[i] = null;
			}
		}
	}
	 
	public static Node root = new Node();
	
	//insert in trie
	public static void insert(String word) { //0(L)
		Node curr = root;
		for(int level=0; level<word.length(); level++) {
			int idx = word.charAt(level) - 'a';
			if(curr.children[idx] == null) {  //if char is not in array
				curr.children[idx] = new Node();  //storing adress of new node in curr node children array
			}
			curr = curr.children[idx];  //update curr
		}
		
		curr.eow = true; //after for loop insertion finish so last eow becomes true
	}
	
	//search in tries
	public static boolean search(String key) { //O(L)
		Node curr = root;
		for(int level=0; level<key.length(); level++) {
			int idx = key.charAt(level) - 'a';
			if(curr.children[idx] == null) {
				return false;
			}
			curr = curr.children[idx]; 
		}
		
		return curr.eow == true;  //we inserted only 'their' in trie and we are searxhing for 'the' answer will true but we never inserted "the". hence if at end eow is not true then return false 
	}
	
	//longest word
	public static String ans = ""; //final string
	
	public static void longestWord(Node root, StringBuilder temp) {
		if(root == null) {
			return;
		}
		
		for(int i=0; i<26; i++) {
			if(root.children[i] != null && root.children[i].eow == true) {
				char ch = (char)(i+'a');   //curr node we found which was not null and eow was true (typecast bcz i+'a' gives int)
				temp.append(ch);
				if(temp.length() > ans.length()) {
					ans = temp.toString();   //temp is string builder
				}
				longestWord(root.children[i], temp);
				temp.deleteCharAt(temp.length()-1); //backtrack bcz once null is hit we dont need curr childrens we will choose another path to chek longestword
			}
		}
	}

	public static void main(String[] args) {
		String words[] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
		for(int i=0; i<words.length; i++) {
			insert(words[i]);
		}
    
        longestWord(root, new StringBuilder("")); //calculate
        System.out.println(ans); //print final ans
	}

}
