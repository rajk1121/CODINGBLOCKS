package Lecture15;



public class BST {
	private class Node {
		int data;
		Node right;
		Node left;
		private Node(int data ,Node left ,Node right){
			this.left=left;
			this.right=right;
			this.data=data;
		}
		
		
	}
	private Node root=null;
	int size=0;
	public void add(int data) {
		if(this.root==null) {
			Node node=new Node(data , null , null);
			this.root=node;
			this.root.data=data;
			this.size++;
			
		}else {
		this.add(data, this.root);
	}
	}
	private void add(int data , Node node) {
		
		
		if(data<node.data&&node.left==null) {
			Node node1=new Node(data , null , null);
			node.left=node1;
			node1.data=data;
			this.size++;
		}
		if(data>node.data&&node.right==null) {
			Node node1=new Node(data , null , null);
			node.right=node1;
			node1.data=data;
			this.size++;
		}
		if(data<node.data&&node.left!=null) {
			add(data,node.left);
		}
		if(data>node.data&&node.right!=null) {
			add(data,node.right);
		}
		
	}
	public int max() {
		return this.max(this.root);
		
	}
	private int max(Node node) {
		if(node==null) {
			return 0;
		}
		int max=max(node.right);
		if(max>node.data) {
			return max;
		}
		else {
			return node.data;
		}
	}
	public int min() {
		return this.min(this.root);
	}
	public int min(Node node) {
		if(node.left==null) {
			return node.data;
		}
		
		int minl=min(node.left);
		if(minl<node.data) {
			return minl;
			}
		else {
			return node.data;
		}
	}public boolean isBST() {
		return this.isBST(this.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	private boolean isBST(Node node,int min,int max) {
		if(node==null) {
			return true;
		}
		if(node.data>max||node.data<min) {
			return false;
		}else if(!isBST(node.left,min,node.data)) {
			return false;
		}else if(!isBST(node.right,node.data,max)) {
			return false;
		} else {
			return true;
		}
		
	}
	public void remove(int data) {
		this.root = this.remove(this.root, data);
	}

	private Node remove(Node node, int data) {
		if (node == null) {
			return null;
		}

		if (data < node.data) {
			node.left = this.remove(node.left, data);
			return node;
		} else if (data > node.data) {
			node.right = this.remove(node.right, data);
			return node;
		} else {
			if (node.left == null && node.right == null) {
				this.size--;
				return null;
			} else if (node.left == null) {
				this.size--;
				return node.right;
			} else if (node.right == null) {
				this.size--;
				return node.left;
			} else {
				int lmax = this.max(node.left);
				node.data = lmax;
				node.left = this.remove(node.left, lmax);
				return node;
			}
		}
	}
	public void range(int k1 , int k2){
 	    this.range(this.root , k1,k2);
 	}
 	private void range(Node node,int k1 , int k2){
 	    if(node==null){
 	        return;
 	    }
 	    if(node.left!=null){
 	        this.range(node.left , k1,k2);
 	    }
 	    if(node.right!=null){
 	        this.range(node.right,k1,k2);
 	    }
 	    if(node.data>=k1 && node.data<=k2){
 	        System.out.print(node.data+" ");
 	    }
 	}
	public void display() {
 		this.display(this.root);
 	}
 	private void display(Node node) {
 		if(node==null) {
 			return;
 		}
 		if(node.left!=null) {
 			System.out.print(node.left.data+"=>");
 		}
 		else {
 			System.out.print("End=>");
 		}
 		System.out.print(node.data);
 		if(node.right!=null) {
 			System.out.println("<="+node.right.data);
 		}
 		else {
 			System.out.println("<=End");
 		}  
 		if(node.left!=null) {
 		display(node.left);
 		}
 		if(node.right!=null) {
 			display(node.right);
 		}
 	}
}
