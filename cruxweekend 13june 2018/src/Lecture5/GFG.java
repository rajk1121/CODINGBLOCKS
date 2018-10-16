package Lecture5;

import java.util.Arrays;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int T=s.nextInt();
	    for(int i=0 ; i< T ; i++){
	        int n=s.nextInt();
	        int[] arr=new int[n];
	        int c=sum(s,arr);
	        System.out.println(c);
	    }
		//code
	}
	public static int sum(Scanner s,int[] arr){
	    for(int i=0 ; i<arr.length ; i++){
	        arr[i]=s.nextInt();
	    }
	    int m=s.nextInt();
	    int sum=0;
	    int count=0;
	 Arrays.sort(arr);
	    for(int i=0 ; i<arr.length ; i++){
	    	int a=arr[i];
	        for(int j=i+1 ; j<arr.length ; j++){
	            int b=arr[j];
	        	for(int k=j+1 ; k<arr.length ; k++){
	               int c=arr[k];
	        		for(int l=k+1 ; l<arr.length ; l++){
	                    int d=arr[l];
	        			sum=arr[i]+arr[j]+arr[k]+arr[l];
	                    if(sum==m){
	                        count++;
	                    }
	                }
	            }
	        }
	    }
	    if(count>0) {
	    return 1;
	    }
	    return 0;
	    
	}
}