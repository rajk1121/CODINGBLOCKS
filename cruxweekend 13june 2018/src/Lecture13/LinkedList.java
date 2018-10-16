package Lecture13;

import java.util.HashMap;

public class LinkedList {
	
	private class Node {
		int data;
		Node next;
		Node(int data , Node next){
			this.data=data;
			this.next=next;
		}
	}
		public Node head;
		public  Node tail;
		int size;
		public LinkedList() {
			this.head=null;
			this.tail=null;
			this.size=0;
		}	
		public int size() {
			return this.size;
		}
		public boolean isEmpty() {
			return this.size()==0;
		}
		public void addFirst(int data)  {
			Node node=new Node(data , this.head);
			if(this.size()==0) {
				this.head=node;
				this.tail=node;
			}
			else {
			this.head=node;
			}
			this.size++;
		}
		public void addLast(int  data) {
			Node node=new Node(data, null);
			if(this.size()==0) {
				this.head=node;   
				this.tail=node;
			}else {
				this.tail.next=node;
			this.tail=node;
			}
			this.size++;
		}
		private Node getNodeAt(int index) throws Exception{
			if(index<0 || index>this.size()) {
				throw new Exception ("Invalid Index");
			}
			
			int count=0;
			Node temp=this.head;
			while(count<index) {
				temp=temp.next;
				count++;
			}
			return temp;
			
		}
		public void addAt(int index , int data) throws Exception {
			if(index<0 || index>this.size()) {
				throw new Exception("Invalid Index");
			}
			if(index==0) {
				this.addFirst(data);
			}else if(index==this.size()) {
			this.addLast(data);
			}else {
				Node temp=getNodeAt(index-1);
				Node node=new Node(data,temp.next );
				temp.next=node;
			}
			
		}
		private  boolean cycle(Node node , HashMap<Integer , Boolean > map){
		       if(node==null){
		         return false;
		       }
		       if(!map.containsKey(node.data)){
		           map.put(node.data , true);
		         boolean ans=this.cycle(node.next , map);
		         return ans;
		       }else{
		       return true;
		       }
		       
		      
		    }
		public void hasCycle() {
			boolean ans=this.hasCycle(this.head);
			System.out.println(ans);
		}
		 private    boolean hasCycle(Node head) {
		       HashMap<Integer , Boolean > map=new HashMap();
		   
		       boolean ans=this.cycle(head , map);
		      return ans;

		    }

		public int getFirst() throws Exception {
			if(this.size()==0) {
				throw new  Exception ("List Empty");
			}
			
			
			return this.head.data;
		}
		public Node removeDuplicates(Node head) {

		      if(head==null){
		        return null;
		      }
		      Node node=head;
		      while(node.next!=null){
		     Node node1=node.next;
		        while(node.data==node1.data){
		          node.next=node1.next;
		          node1=node1.next;
		          if(node1==null) {
		        	  return head;
		          }
		        }
		       node=node.next;  
		      }
		      return head;
		      }

		public int getLast() throws Exception{
			if(this.size()==0) {
				throw new Exception ("List Empty");
			}
			
			return this.tail.data;
		}
		public void removeFirst() throws Exception{
			if(this.size()==0) {
				throw new Exception ("List Empty");
			}
			if(this.size()==1) {
				this.head=null;
				this.tail=null;
			}
			else{
			
			
			this.head=this.head.next;
			
		}
			this.size--;
		}
		public void removeLast() throws Exception {
			
			if(this.size()==0) {
				throw new Exception ("List Empty");
			}
			if(this.size()==1) {
				this.head=null;
				this.tail=null;
			}else {
			
	     Node temp=getNodeAt(this.size()-2);
	     this.tail=temp;
	     temp.next=null;
	     this.size--;
		}
		}
		public void removeAt(int index) throws Exception{
			if(this.size()==0) {
				throw new Exception (" List Empty");
			}
			if(index<0 || index>this.size()) {
				throw new Exception (" Invalid Index");
			}
			if(this.size()==1) {
				this.head=null;
				this.tail=null;
			}
			else {
			
			
			Node temp=getNodeAt(index-1);
			temp.next=temp.next.next;
				}
			this.size--;
	}
		public void display() {
			Node node=this.head;
			while(node!=null) {
				System.out.print(node.data+"=>");
				node=node.next;
			}
			System.out.println("End");
		}
	
	public void reverseDI() throws Exception {
		for(int i=0 ; i<this.size()/2 ; i++) {
			Node node=this.getNodeAt(i);
			Node node1=this.getNodeAt(this.size()-i-1);
			int temp=node.data;
			node.data=node1.data;
			node1.data=temp;
			
			
		}
		
	}
	public void kthNode(int k) {
		
		Node node=this.head;
		Node node1=this.head;
		Node node2=this.head;
		int n=0;
		while(n<k) {
			node=node.next;
			n++;
		}
		while(node.next!=null) {
			node=node.next;
			node1=node1.next;
		}
		this.tail.next=this.head;
		this.head=node1.next;
		this.tail=node1;
		this.tail.next=null;
}
	public void reversePI() {
		Node prev=this.head;
		Node curr=prev.next;
		while(curr!=null) {
			Node tempprev=prev;
			Node tempcurr=curr;
			prev=curr;
			curr=curr.next;
			tempcurr.next=tempprev;
		}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;

	}
	public void reverse(Node node , Node node1) {
		if(node.next==null) {
			this.head=node;
			return;
			
		}
		reverse(node.next , node1);
		node.next.next=node;
		if(node==node1) {
			this.tail=node;
			node.next=null;
			
		}
	}
	public LinkedList merge(LinkedList other) throws Exception {
		LinkedList sorted=new LinkedList();
		Node node1=this.head;
		Node node2=other.head;
		int k=0;
		while(node1!=null && node2!=null) {
			if(node1.data<node2.data) {
				sorted.addAt(k,node1.data);
				node1=node1.next;
				k++;
				continue;
			}
			if(node2.data<node1.data) {
				sorted.addAt(k,node2.data);
				node2=node2.next;
				k++;
				continue;
			}
			
			
		}
		while(node1!=null) {
			sorted.addAt(k,node1.data);
			node1=node1.next;
			k++;
		}
		while(node2!=null) {
			sorted.addAt(k,node2.data);
			node2=node2.next;
			k++;
		}
		return sorted;
	}
	public void oddeven() {
		int i=0;
		while(i<this.size()) {
			Node node=this.head;
			while(node!=null) {
				if(node.data%2==0) {
					if(node.next!=null) {
					Node node1=node.next;
					if(node1.data%2!=0) {
						int temp=node.data;
						node.data=node1.data;
						node1.data=temp;
					}
					}
				}
				node=node.next;
			}
			i++;
		}
		
	}
	public void duplicates(){
	    Node node=this.head;
	    while(node!=null) {
	    	Node node1=node.next;
	    	
	    	while(node1!=null) {
	    		if(node1.data==node.data) {
		    		node.next=node1.next;
		    		if(node1.next==null) {
		    			return;
		    		}else {
		    		node1=node.next;
		    		  }
		    		}
	    		else {
	    	node1=node1.next;
	    			}
	    }
	    	
	    	node=node.next;
	    	if(node.next==null) {
	    		return;
	    	}
	    }
	}
	public void KReverse(LinkedList help , int k) throws Exception{
		
		Node node1=this.head;
		if(this.size()%k==0) {
		for(int i=1 ; i<=this.size()/k; i++) {
			int l=i*k-1;
			Node node2=help.getNodeAt(l);
			for(int j=1 ; j<=k ; j++) {
				if(j==k) {
					node1.data=node2.data;
					node1=node1.next;
				}
				else {
				node1.data=node2.data;
				l=l-1;
				node2=help.getNodeAt(l);
				node1=node1.next;
				}
		}
		}
		}
		else {
			for(int i=1 ; i<=this.size()/k ; i++) {
			int l=i*k-1;
			Node node2=help.getNodeAt(l);
			for(int j=1 ; j<=k ; j++) {
				if(j==k) {
					node1.data=node2.data;
					node1=node1.next;
				}
				else {
				node1.data=node2.data;
				l=l-1;
				node2=help.getNodeAt(l);
				node1=node1.next;
				}
		}
		}
			
		}
			
	}
	

}
