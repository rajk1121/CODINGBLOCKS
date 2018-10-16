package Lecture6;

import java.util.ArrayList;
import java.util.Scanner;

public class Stringbuilder {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s=new Scanner (System.in);
//		int n=s.nextInt();
//		ArrayList<String> list=new ArrayList();
//		for(int i=0 ; i<n ; i++) {
//			String s1=s.next();
//	        list.add(s1);
//		
//		}
//		for(int i=0 ; i< list.size() ; i++) {
//			getSS(list.get(i) , "");
//		}
//		
//
//	}
//	public static void getSS(String str , String res ){
//		if(str.length()==0) {
//			System.out.println(res);
//			return;
//		}
//		
//		
//		char cc=str.charAt(0);
//		String ros=str.substring(1);
//		getSS(ros , res);
//		getSS(ros , res+cc);
//		
//		
//	}
//
	 public static void add(ArrayList<Integer> list , int n){
		    list.add(n);
		}
		  public static void delete(ArrayList<Integer> list , int n){
		    int index=0;
		    for(int i=0 ; i<list.size() ; i++){
		      if(list.get(i)==n){
		        index=i;
		      }
		    }
		    list.remove(index);
		  }
		   public static int print(ArrayList<Integer> list){
		    int min=Integer.MAX_VALUE;
		     
		     for(int i=0 ; i<list.size(); i++){
		     if(list.get(i)<min){
		       min=list.get(i);
		     } 
		    }
		     return min;
		    
		  }
		    public static void main(String[] args) {
		        Scanner s=new Scanner (System.in);
		      int N=s.nextInt();
		      ArrayList<Integer> list=new ArrayList();
		      for(int i=0; i<N ; i++){
		        int q=s.nextInt();
		        if(q==1){
		          int n=s.nextInt();
		          add(list , n);
		        }else if(q==2){
		           int n=s.nextInt();
		          delete(list , n);
		         }else {
		         int mon= print(list);
		          System.out.println(mon);
		        }
		      }
		    }
}
