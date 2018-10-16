package Lecture14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;





public class BTree  {
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
	 public BTree() {
		Scanner s=new Scanner (System.in);
		this.root=takeInput(s ,null , false);
	}
	 public Node takeInput(Scanner s, Node parent , boolean isleftorright) {
		 if(parent==null) {
			 System.out.println("Enter the root node data");

		 }
		 else {
			 if(isleftorright) {
				 System.out.println("Enter the data for left of "+parent.data);
			 }
			 else {
				 System.out.println("Enter the data for right of "+parent.data);
			 }
		 }
			 		 int nodedata=s.nextInt();
		 Node node=new Node(nodedata , null , null);
		 this.size++;
		 System.out.println("Do you have a left node for"+node.data);
		 boolean choice=s.nextBoolean();
		 if(choice) {
			
			 node.left=takeInput(s , node , true);
		 }
		 System.out.println("Do you have a right node"+node.data);
		choice=s.nextBoolean();
		 if(choice) {
				 node.right=takeInput(s , node , false);
		 }
		 return node;
	 }
	 public void lca(int v1 , int v2) {
		 Node lca=lca(this.root , v1,v2);
		 System.out.println(lca.data);
	 }
	 private Node lca(Node node , int v1 , int v2) {
		if(node==null) {
			return node;
		}
		
		if(node.left!=null ) {
			if(node.left.data==v1 || node.left.data==v2) {
				return node;
			}
		}
		if(node.right!=null) {
			if( node.right.data==v1 || node.right.data==v2) {
					return node;
				}
			
		}
		Node n1=lca(node.left, v1, v2);
		Node n2=lca(node.right, v1, v2);
		if(n1!=null && n2!=null) {
			return node;
		}
		if(n1!=null) {
			return n1;
		}else {
			return n2;
		}
		 
		 
		 
	 }
	 public void removeLeaf() {
		 this.removeLeaf(this.root);
	 }
	 private Node removeLeaf(Node node) {
		 if(node==null) {
			 return null;
		 }
		 if(node.left==null && node.right==null) {
			 return null;
		 }
		 if(node.left!=null) {
			 node.left=removeLeaf(node.left);
		 }
		 if(node.right!=null) {
			 node.right=removeLeaf(node.right);
		 }
		 return node;
		 
	 }
	 public void sibling() {
         this.sibling(this.root);
     }

     private void sibling(Node node) {
         if(node==null){
             return;
         }
         
         if(node.left!=null && node.right!=null){
             sibling(node.left);
             sibling(node.right);
         }
         else if(node.left!=null){
             System.out.print(node.left.data + " ");
             sibling(node.left);
         }
         else if(node.right!=null){
             System.out.print(node.right.data + " ");
             sibling(node.right);
         }
}
 
//	 public void preOrderRange(int from,int to) {
//         this.preOrderRange(this.root,from,to);
//     }
//     private void preOrderRange(Node node,int from,int to) {
//         if (node == null) {
//             return ;
//         }
//         if(node.data>from && node.data<to)
//         {
//          System.out.println(node.data+" ");
//         }
//         this.preOrderRange(node.left,from,to);
//         this.preOrderRange(node.right,from,to);
//     }
	 public void Sum() {
		 int sum=this.Sum(this.root,0);
		 System.out.println(sum);
	 }
	 private int Sum(Node node,int sum) {
		 if(node==null) {
			 return 0;
		 }else {
			 sum=sum+node.data;
		 }
		 if(node.left!=null) {
		
			sum = Sum(node.left , sum);
		 }
		 if(node.right!=null) {
			sum = Sum(node.right , sum);
		 }
		 return sum;
		 
		 
	 }
	 public boolean isBST() {
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
		
	 	public void display() {
	 		this.display(this.root);
	 	}
	 	private void display(Node node) {
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
		public static void topView(Node root) {
	        Topleft(root.left) ;
	    System.out.print(root.data+" ");
	        Topright(root.right);
	      
	    }
	public static void Topleft(Node node){
	  if(node==null){
	    return;
	  }
	  Topleft(node.left);
	  System.out.print(node.data+" "); 
	}
	public static void Topright(Node node){
	  if(node==null){
	    return;
	  }
	    System.out.print(node.data+" ");
	  Topright(node.right);

	}
	 	public void Level() {
	this.Level(this.root);
	 	}
		private void Level(Node node) {
			LinkedList<Node> queue=new LinkedList();
			queue.addLast(node);
			ArrayList<Integer> values=new ArrayList<>();
			int x=node.data;
			values.add(x);
			
			while(!queue.isEmpty()) {
				Node rv=queue.removeFirst();
				
				if(rv.left!=null) {
					queue.addLast(rv.left);
					x=rv.left.data;
					values.add(x);
				}else {
					values.add(Integer.MIN_VALUE);
				}
				if(rv.right!=null) {
					queue.addLast(rv.right);
					x=rv.right.data;
					values.add(x);
				}else {
				values.add(Integer.MIN_VALUE);
				}
			}
//			System.out.println(map.keySet());
			ArrayList<ArrayList<Integer>>list=array(values);
			for(int i=0 ; i<list.size() ; i++) {
				ArrayList<Integer> list1=list.get(i);
				for(int j=0 ;j<list1.size();j++) {
					System.out.print(list1.get(j)+" ");
				}
				System.out.println();
			}
			
			
			}
		public ArrayList<ArrayList<Integer>> array(ArrayList<Integer> values) {
			ArrayList<ArrayList<Integer>> list=new ArrayList<>();
			ArrayList<Integer> list1=new ArrayList<>();
		
			int l=0;
			for(int i=0 ; i<=this.height(this.root) ; i++) {
				for(int k=0 ; k<(int)Math.pow(2, i);k++) {
					if(l<values.size()) {
					if(values.get(l)!=Integer.MIN_VALUE) {
//						System.out.println(entry.getKey());
						list1.add(values.get(l));
					}
					l++;
					}
					
				}
				 
//					System.out.println(list1);
					list.add(list1);
					list1=new ArrayList<>();
				
				
				
			}
			return list;
			
		}
	 	public void height() {
	 		int height=height(this.root);
	 		System.out.println(height);
	 	}
	 	private int height(Node node) {
	 		if (node == null) {
				return -1;
			}
			int lheight = this.height(node.left);
			int rheight = this.height(node.right);
			return Math.max(lheight, rheight) + 1;

	 		
	 	}
	 

	 	public  void InOrder() {
	 		this.InOrder(this.root);
	 	}
	 	private void InOrder(Node node) {

	 		if(node.left!=null) {
	 			InOrder(node.left);
	 			
	 		}
	 		System.out.print(node.data+" ");
	 		if(node.right!=null) {
	 			InOrder(node.right);
	 		}
	 	
	 	}
	 	public void RootToLeaf(int k) {
	 		this.RootToLeaf(this.root , 0 ,"" , k);
	 	}
	 	private void RootToLeaf(Node node, int sum,String res, int k) {
	 		
	 		if(sum>k) {
	 			return;
	 		}
			if(node==null) {
				return;
			}
			if(node!=null) {
				res=res+node.data+" " ;
				sum=sum+node.data;
				if(node.left!=null) {
					RootToLeaf(node.left, sum, res, k);
				}else {
					if(sum==k) {
						System.out.println(res);
						return;
						}else {
							return;
						}
				}
				if(node.right!=null) {
					RootToLeaf(node.right, sum, res, k);
				}else {
					if(sum==k) {
						System.out.println(res);
						return;
						}else {
							return;
						}
				}
			}
			
			
		}
		public void post() {
	 		this.post(this.root);
	 	}
	 	private void post(Node node) {
	 		
	 		if(node.left!=null) {
	 			post(node.left);
	 		}
	 		if(node.right!=null) {
	 			post(node.right);
	 		}
	 		System.out.print(node.data+" ");
	 	}
	 	public void pre() {
	 		this.pre(this.root);
	 	}
	 	private void pre(Node node) {
	 		
	 		System.out.print(node.data+" ");
	 		if(node.left!=null) {
	 			pre(node.left);
	 		}
	 		if(node.right!=null) {
	 			pre(node.right);
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
	 	    if(node.data>=k1 || node.data<=k2){
	 	        System.out.print(node.data+" ");
	 	    }
	 	}
	 	public void size2() {
	 		int size=size2(this.root);
	 		System.out.println(size);
	 	}
	 	private int size2(Node node) {
	 		int count=0;
	 		if(node.left!=null) {
	 			count+=size2(node.left);
	 			
	 		}
	 		if(node.right!=null) {
	 			count+=size2(node.right);
	 		}
	 		return count+1;
	 		
	 	}
	 	public void max() {
	 		int max1=this.Max(this.root,0);
	 		System.out.println(max1);
	 	}
	 	private int Max(Node node,int max) {
	 		int max1=node.data;
	 		if(node.left!=null) {
	 		max=Max(node.left,max);
	 		if(max>max1) {
	 			max1=max;
	 		}
	 		}
	 		
	 		
	 		if(node.right!=null) {
	 			max=Max(node.right,max);
		 		if(max>max1) {
		 			max1=max;
		 		}
	 		}
	 		return max1;
	 	}
	 	public void min() {
	 		int min1=this.Min(this.root,0);
	 		System.out.println(min1);
	 	}
	 	private int Min(Node node,int min) {
	 		int min1=node.data;
	 		if(node.left!=null) {
	 		min=Min(node.left,min);
	 		if(min<min1) {
	 			min1=min;
	 		}
	 		}
	 		
	 		
	 		if(node.right!=null) {
	 			min=Min(node.right,min);
		 		if(min<min1) {
		 			min1=min;
		 		}
	 		}
	 		return min1;
	 	}
}
