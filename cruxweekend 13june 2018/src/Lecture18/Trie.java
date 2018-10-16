package Lecture18;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Trie {
	public class Node{
		
		char data;
		boolean isTerminal;
		HashMap<Character, Node> children;
		Node(char data , boolean isTerminal){
			
			this.data=data;
			this.isTerminal=isTerminal;
			this.children=new HashMap<>();
		}
	}
	Node root;
	int numwords;
	public Trie(){
		this.root=new Node('\0',false);
		this.numwords=0;
	}
	public int numwords() {
		return this.numwords; 
	}
	public void DT() {
		this.DT(this.root);
	}
	public boolean prefix(String str) {
		boolean ans=prefix( str , this.root);
		if(ans) {
			System.out.println("BAD SET");
			System.out.println(str);
		}
		return ans;
		
	}
	private boolean prefix(String str , Node node ) {
		if(str.length()!=0 && node.isTerminal) {
			
			return true;
		}
		if(str.length()==0) {
			node.isTerminal=true;
			return false;
		}
	
		char cc=str.charAt(0);
		boolean ans=false;
		if(node.children.containsKey(cc)) {

			
			ans=this.prefix(str.substring(1), node.children.get(cc));
			
		}else {
			Node n= new Node (cc, str.length()==1);
			
			node.children.put(cc,n);
			ans=this.prefix(str.substring(1), n);
			
		}
		return ans;
		
		
		
		
		
	}
	private void DT(Node node) {
		// TODO Auto-generated method stub
		String str="";
		str=str+node.data+"=>";
		Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
		for(Map.Entry<Character, Node> entry:entries) {
			str=str+entry.getKey()+",";
		}
		str=str+"END";
		System.out.println(str);
		for(Map.Entry<Character, Node> entry: entries) {
			this.DT(entry.getValue());
		}
	}
	public void remove(String word) {
		this.remove(word,this.root);
	}
	private void remove(String word , Node node) {
		if(word.length()==0 && node.isTerminal) {
			node.isTerminal=false;
			return;
			
		}
		char cc=word.charAt(0);
		if(!node.children.containsKey(cc)) {
			return;
		}else {
			this.remove(word.substring(1), node.children.get(cc));
		}
		Node node1=node.children.get(cc);
		if(!node1.isTerminal&&node1.children.size()==0) {
			node.children.remove(cc);
		}
	}
		
	
	public void search(String word) {
		boolean ans=this.search(word , this.root);
		System.out.println(ans);
	}

	private boolean search(String word, Node node) {
		if(word.length()==0 && !node.isTerminal) {
			return false;
		}
		else if(word.length()==0 && node.isTerminal) {
			return true;
		}
		boolean ans=false;
		if(!node.children.containsKey(word.charAt(0))) {
			return false;
		}else {
			 ans=this.search(word.substring(1), node.children.get(word.charAt(0)));
			
		}
		return ans;   
	}
	 
	        public void add(String word) {
		this.add(word, this.root);
	}
	
	private void add(String word , Node node) {
	if(word.length()==0) {
			
			return;
		}
		
			if(node.children.containsKey(word.charAt(0))) {
				this.add(word.substring(1), node.children.get(word.charAt(0)));
			}else {
				node.children.put(word.charAt(0), new Node(word.charAt(0),word.length()==1));
				this.add(word.substring(1), node.children.get(word.charAt(0)));
			}
		
		
	}
	    
	public void display() {
		this.display(this.root,"");
	}
	private void display(Node node , String osf) {
		if(node.isTerminal) {
			String toprint=osf.substring(1)+node.data;
			System.out.println(toprint);
		}
		
		Set<Map.Entry<Character, Node>> entries=node.children.entrySet();
		for(Map.Entry<Character, Node> entry:entries) {
			this.display(entry.getValue(), osf+node.data);
		}
	}
	
	
	
}
