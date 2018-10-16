package Lecture9;



public class SegmentTree {

  private class Node{
	  int data;
	  int si;
	  int ei;
	  Node left;
	  Node right;
	  private Node( int si , int ei) {
		
		 this.si=si;
		 this.ei=ei;
		}
	  
  }
  Node root;
  public SegmentTree(int[] arr) {
	  this.root=this.constructTree( arr ,0,arr.length-1);
  }
private Node constructTree(int[] arr, int si, int ei) {
	if(si==ei) {
		Node node=new Node(si , ei);
		node.left=null;
		node.right=null;
		node.data=arr[si];
		return node;
	}
	
	
	int mid=(si+ei)/2;
	Node node=new Node(si , ei);
	node.left=constructTree(arr , si, mid);
	node.right=constructTree(arr, mid+1, ei);
	node.data=node.left.data+node.right.data;
	return node;
}

public void display() {
	this.display(this.root);
}
private void display(Node node) {
	
	if(node==null) {
		return;
	}
	
	String str=new String();
	if(node.left!=null) {
		str=str+node.left.data+"=>";
	}else {
		str=str+"No Left child=>";
	}
	str=str+node.data+"<=";
	if(node.right!=null) {
		str=str+node.right.data;
	}else {
		str=str+"No right child";
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
