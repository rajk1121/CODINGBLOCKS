package Lecture18;

import java.util.Scanner;

public class TrielClient {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie trie=new Trie();
		 Scanner s = new Scanner(System.in);
		
		 
		
//    	trie.add("art");
//		trie.add("arts");
//		trie.add("bug");
//		trie.add("boi");
//		trie.add("sea");
//		trie.add("see");
//		trie.add("seen");
////		trie.remove("arts");
////		trie.remove("art");
////		trie.DT();
////		trie.display();
//		trie.prefix("artgs");
//		 int count=0;
//
//		 int N=s.nextInt();
//		 for(int i=0 ; i<N; i++) {
//			 String str=s.next();
//			 boolean ans=trie.prefix(str);
//			 if(ans) {
//				 count++;
//				 break;
//			 }
//			 
//		 }
//		 if(count==0) {
//			 System.out.println("GOOD SET");
//		 }
		
	      int T=s.nextInt();
	      for(int i=0 ; i<T;i++){
	         String str=new String();
	        str=s.next();
	        String str1=s.next();
	     
	     if(str.equals("add")) {
	       trie.add(str1);
	     }else{
	     trie.search(str1);
	     
	     }
	     
	      }
	}

}
