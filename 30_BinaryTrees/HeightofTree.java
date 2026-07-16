import java.util.*;
public class HeightofTree {
	
	static class Node {
		int data;
	    Node left, right;
	    
	    public Node(int data) {
	    	this.data = data;
	    	this.left = null;
	    	this.right = null;
	    }
	}
	
	//height of tree 
	public static int height(Node root) {  //O(n)
		if(root == null) {
			return 0;
		}
		
		int lh = height(root.left);
		int rh = height(root.right);
		return Math.max(lh, rh) + 1;
	}
	    
	//count of nodes
	public static int count(Node root) {  //O(n)
		if(root == null) {
			return 0;
		}
		
		int lcount = count(root.left);
		int rcount = count(root.right);
		return (lcount+rcount)+1;
		
	}
	
	//sum of nodes
	public static int sum(Node root) {
		if(root == null) {
			return 0;
		}
		
		int leftSum = sum(root.left);
		int rightSum = sum(root.right);
		return leftSum + rightSum + root.data;  //leftSum,rightSum eventually return int do dry run you will get it
		
	}
	
	//length of diameter - max distance between 2 leaf nodes
	public static int diameter2(Node root) {  //O(n2)
		if(root == null) {
			return 0;
		}
		
		int leftDiam = diameter2(root.left);
		int leftHt = height(root.left);
		int rightDiam = diameter2(root.right);
		int rightHt = height(root.right);
		
		int selfDiam = leftHt + rightHt + 1;
		
		return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
	} 
	
	//length of diameter  //O(n)
	static class Info {
		int diam;
		int ht;
		
		public Info(int diam, int ht) {
			this.diam = diam;
			this.ht = ht;
			}
	}
	//Info(class) return type
	public static Info diameter(Node root) {
		if(root == null) {
			return new Info(0, 0);
		}
		Info leftInfo = diameter(root.left);  //info is type
		Info rightInfo = diameter(root.right);
		
		int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
		int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
		 
		return new Info(diam, ht); //makes new object of info class
		
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		System.out.println("height of tree is " + height(root));
		System.out.println();
		System.out.println("total no of nodes are " + count(root));
		System.out.println("Sum of nodes is " + sum(root));
		
		System.out.println("diameter " + diameter2(root));
		
		System.out.println(diameter(root).diam); //dia(root) -> Info object

	}

}
