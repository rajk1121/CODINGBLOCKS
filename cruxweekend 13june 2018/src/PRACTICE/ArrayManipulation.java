package PRACTICE;

import java.util.Scanner;

public class ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int[][] queries=new int[m][3];
		for(int i=0 ; i<m ; i++) {
			for(int j=0 ; j<3 ;j++) {
				queries[i][j]=s.nextInt();
			}
		}
		long ans=arrayManipulation(n, queries);
		System.out.println(ans);
		
	}
	public static long arrayManipulation(int n, int[][] queries) {
        long[]zero=new long[n];
        long ans=Integer.MIN_VALUE;
        for(int i=0 ; i<queries.length ; i++){
          for( int j=queries[i][0]-1 ; j<queries[i][1] ; j++){
            zero[j]+=queries[i][2];
            if(zero[j]>ans) {
            	ans=zero[j];
            }
            
          }
        }
 
//  for(int i=1 ; i<n ; i++){
//    if(zero[i]>ans){
//      ans=zero[i];
//    }
//  }
  return ans;

}

}
