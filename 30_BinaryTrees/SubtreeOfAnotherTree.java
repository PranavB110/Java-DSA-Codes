import java.util.*;
//check subtree exits or not true or false
public class SubtreeOfAnotherTree {
	static class Node {
		int data;
		Node left, right;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;

		}
	}
	
	//step 1
	public static boolean isSubtree(Node root, Node subRoot) {
		if(root == null) {
			return false;
		}
		//roots are same and sub nodes are also identical return true
		if(root.data == subRoot.data) {
			if(isIdentical(root, subRoot)) {
				return true;
			}
		}
		
		//checking for left sub tree or right as upper root was same but sub nodes failed
		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);  //according to OR(||) if 1st cndtn true then dont check 2nd
	}
	
	//step2
	public static  boolean isIdentical(Node node, Node subRoot) {
		if(node == null && subRoot == null) {  //dono null ->identical
			return true;
		} else if(node == null || subRoot == null || node.data != subRoot.data) {  //dono main ek null -> not iden
			return false;
		}
		
		if(!isIdentical(node.left, subRoot.left)) {  //left nodes
			return false;
		}
		if(!isIdentical(node.right, subRoot.right)) {  //right nodes
			return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		Node subRoot = new Node(2);
		subRoot.left = new Node(4);
		subRoot.right = new Node(5);
		
		System.out.println(isSubtree(root, subRoot));

	}

}
