package Lecture12;

import java.util.Scanner;

public class stackuaClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int T=s.nextInt();
		Stack stack=new Stack();

		
	}
}
		
		
//	}
//	  public static String isBalanced(String s) throws Exception {
//
//	       Stack stack=new Stack(s.length());
//	       for(int i=0 ; i<stack.data.length;i++){
//	         if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
//	           stack.push(s.charAt(i));
//	         }
//	         if(s.charAt(i)==')' ){
//	        	 if(stack.size()==0) {
//	        		 return "NO";
//	        	 }
//	           char rv=stack.pop(); 
//	            if(rv!='('){
//	             return "NO";
//	           }
//	         }
//	         if(s.charAt(i)=='}' ){
//	        	 if(stack.size()==0) {
//	        		 return "NO";
//	        	 }
//	           char rv=stack.pop(); 
//	            if(rv!='{'){
//	             return "NO";
//	           }
//	         }
//	         if(s.charAt(i)==']' ){
//	        	 if(stack.size()==0) {
//	        		 return "NO";
//	        	 }
//	           char rv=stack.pop(); 
//	            if(rv!='['){
//	             return "NO";
//	           }
//	         }
//	    }
//	      if(stack.size()==0){
//	        return "YES";
//	      }else{
//	        return "NO";
//	      }
//	    }
//
//	  
//
//
//	private static void count(String str) {
//		// TODO Auto-generated method stub
//	StringBuilder sb=new StringBuilder();
//	int j=0;
//	for(int i=0 ; i<str.length();i++) {
//		if(str.charAt(i)=='(') {
//			j++;
//			sb.append(str.charAt(i));
//			System.out.print(j);
//		}else if(str.charAt(i)==')') {
//			sb.deleteCharAt(j-1);
//			System.out.print(j);
//			j--;
//			
//			
//		}
//	}
//	
//		
//		
//	}
//	
//
//}
