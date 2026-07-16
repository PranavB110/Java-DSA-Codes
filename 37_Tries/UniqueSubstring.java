
public class UniqueSubstring {
	
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
	
	//calculate Nodes
	public static int nodeCount(Node root) {
		if(root == null) {
			return 0;
		}
		
		int count = 0;
		for(int i=0; i<26; i++) {
			if(root.children[i] != null) {             //if root is not null then only check for its children count
				count += nodeCount(root.children[i]);
			}
		}
		
		return count+1; //return children count and self count
	}

	public static void main(String[] args) {
       String str = "apple";
       
       for(int i=0; i<str.length(); i++) {
    	  String suffix = str.substring(i);
    	  insert(suffix);
       }
       
       System.out.println(nodeCount(root));

	}

}
