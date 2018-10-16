package PRACTICE;

import java.util.Scanner;

public class XORwithNumbersLessThan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int j=0;j<n;j++) {
		long x=s.nextLong();
		 int ans=0;
	      int pow=1;
	      int y=1;
	      for(int i=0 ;i<64;i++){
	    	  
	        long ch=x^y;
	        if(ch>x && y<x){
	          ans=ans+pow;
	        }
	        y=y<<1;
	       
	        pow=pow*2;
	        
	      }
	    
	     arr[j]=ans;
	}
		for(int j=0 ;j<n;j++) {
			System.out.println(arr[j]);
		}
	}

}
