package Lecture15;

public class AVL {
	private class Node{
		int data;
		int height;
		Node right;
		Node left;
		public Node(int data) {
			this.data=data;
//			this.left=null;
//			this.right=null;
			this.height=1;
		}
		
	}
	Node root;
//	public AVL() {
//		this.root=null;
//	}
	public void insert(int data) {
		
		this.root=this.insert( data , this.root);
	}
	public Node insert(int data , Node node) {
		if(node==null) {
			Node node1=new Node(data);
			
			return node1;
		}
		if(data>node.data) {
			node.right=this.insert(data , node.right);

		}
		else if(data<node.data) {
			node.left=this.insert(data, node.left);
			
		}
		
		node.height=Math.max(height(node.left), height(node.right))+1;
		int bf=this.bf(node);
		if(bf>1 && data<node.left.data) {
			node=rightRotate(node);
			return node;
		}
		else if(bf<-1 && data>node.right.data) {
			node=leftRotate(node);
			return node;
		}
		else if(bf>1 && data >node.left.data) {
			node.left=leftRotate(node.left);
			node=rightRotate(node);
			return node;
		}else if(bf<-1 && data<node.right.data) {
			node.right=rightRotate(node.right);
			node= leftRotate(node);
			return node;
		}
		return node;
	}
	private int height(Node node) {
		// TODO Auto-generated method stub
		if(node==null) {
		return 0;
		}
		return node.height;
	}
	private int bf(Node node) {
		if(node==null) {
			return 0;
		}
		return height(node.left)-height(node.right);
	}
	private Node rightRotate(Node node) {
		
		Node b=node.left;
		Node T3=b.right;
		b.right=node;
		node.left=T3;
		node.height=Math.max(height(node.left), height(node.right))+1;
		b.height=Math.max(height(b.left), height(b.right))+1;
		return b;
		
		
	}
private Node leftRotate(Node node) {
		
		Node b=node.right;
		Node T3=b.left;
		b.left=node;
		node.right=T3;
		node.height=Math.max(height(node.left), height(node.right))+1;
		b.height=Math.max(height(b.left), height(b.right))+1;
		return b;
		
		
	}
public void display() {
	this.display(this.root);
}
private void display(Node node) {
	if(node==null) {
		return ;
	}
	
	String str="";
	if(node.left!=null) {
		str=str+node.left.data+"=>";
	}else {
		str+=".=>";
	}
	str=str+node.data+"<=";
	if(node.right!=null) {
		str+=node.right.data;
	}else {
		str+=".";
	}
	System.out.println(str);
	if(node.left!=null) {
		this.display(node.left);
	}
	if(node.right!=null) {
		this.display(node.right);
	}
}
	
}
