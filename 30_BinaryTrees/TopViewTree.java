import java.util.*;

public class TopViewTree {
	
	static class Node {
		int data;
		Node left, right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class Info {
		Node node;
		int hd;
		
		public Info(Node node, int hd) {
			this.node = node;
			this.hd = hd;
		}
	}
	
	//print top view
	public static void topView(Node root) {
		//level Order traversal
		Queue<Info> q = new LinkedList<>();  
		HashMap<Integer, Node> map = new HashMap<>();  //hd, node
		
		int min = 0, max = 0;
		q.add(new Info(root, 0));  //root add then null then add the child levelorder concept check
		q.add(null);
		
		while(!q.isEmpty()) {
			Info curr = q.remove();
			if(curr == null) {
				if(q.isEmpty()) {  //finish traversal
					break;
				} else {
					q.add(null);  //add at back of children in queue
				}
			} else {
				//add to hashmap
				if(!map.containsKey(curr.hd)) {  //1st time or new hd is added
					map.put(curr.hd, curr.node);
				}
				
				//add child of root in queue
				if(curr.node.left != null) {
					q.add(new Info(curr.node.left, curr.hd-1));
					min = Math.min(min, curr.hd-1);
				}
				if(curr.node.right != null) {
					q.add(new Info(curr.node.right, curr.hd+1));
					max = Math.max(max, curr.hd+1);
				}

			}
			
		}
		
		for(int i=min; i<=max; i++) {
			System.out.print(map.get(i).data+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		topView(root);
	}

}
