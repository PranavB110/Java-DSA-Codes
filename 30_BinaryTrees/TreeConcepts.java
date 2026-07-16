//Binary tree has 2 childrens for each nodes 
//levels and subtree in a tree (level == depth) level amd depth are diff concept but value same
import java.util.*;
public class TreeConcepts {
	static class Node {
		int data;
		Node left;
		Node right;
		
		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static class BinaryTree {
		static int idx = -1;  //static bcz in recursion at evry call same index updated values will be there no previous one as we return
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx] == -1) {
				return null;
			}
			
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);
			
			return newNode;
		}
		
		//Preorder traversal   root-left-right
		public static void preorder(Node root) {  //O(n)
			if(root == null) {
				return;
			}
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
		
		//Inorder traversal left sub -root- right sub
		public static void inorder(Node root) {  //O(n)
			if(root == null) {
				return;
			}
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
		
		//Postorder traversal left subtree - right subtree - root
		public static void postorder(Node root) {
			if(root == null) {
				return;
			}
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
		
		//level Order traversal - level wise
		public static void levelOrder(Node root) {
			if(root == null) {
				return;
			}
			
			Queue<Node> q = new LinkedList<>();
			//step 1
			q.add(root);
			q.add(null);
			
			//step2
			while(!q.isEmpty()) {
				Node currNode = q.remove();
				if(currNode == null) {
					System.out.println();
					if(q.isEmpty()) {
						break;
					} else {
						q.add(null);
					}
				} else {
					System.out.print(currNode.data+" ");
					if(currNode.left != null) {
						q.add(currNode.left);
					}
					if(currNode.right != null) {
						q.add(currNode.right);
					}
				}
				
			}
		}
	}

	public static void main(String[] args) {
		int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);  //root is pointing to root node
        
        System.out.println(root.data);
        tree.preorder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postorder(root);
        System.out.println();
        tree.levelOrder(root);

	}

}