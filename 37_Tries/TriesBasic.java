
public class TriesBasic {
	
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

	public static void main(String[] args) {
		String words[] = {"the", "a", "three", "their", "any", "thee"};
		for(int i=0; i<words.length; i++) {
			insert(words[i]);
		}
		
		System.out.println(search("thee"));
		System.out.println(search("thor"));

	}

}
