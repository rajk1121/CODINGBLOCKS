package PRACTICE;

import java.util.Scanner;

public class stringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		String[] strings=new String[n];
		int q=s.nextInt();
		String[] queries = new String[q];
		for(int i=0 ; i<n ; i++) {
			strings[i]=s.next();
		}
		for(int i=0 ; i<q ; i++) {
			queries[i]=s.next();
		}
		
		int[] ans=count(strings , queries);
		

	}
	public static int[] count(String[] strings, String[] queries) {
		 int[] a=new int[queries.length];
	      for(int i=0 ; i<queries.length ; i++){
	        for(int j=0 ; j<strings.length;j++){
	          if(queries[i].equals(strings[j])){
	            a[i]++;
	          }
	          
	          
	        }
	      }
	      return a;

	}

}
