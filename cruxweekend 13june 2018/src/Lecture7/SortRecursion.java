package Lecture7;

import java.util.Scanner;

public class SortRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i]=s.nextInt();
		}
		boolean ans=isSort(arr,n-1);
		System.out.println(ans);
	}
	public static boolean isSort(int[] arr ,int n) {
		boolean ans = true;
		if(n-1>0) {
		if(arr[n]>arr[n-1]) {
		 ans=isSort(arr,n-1);
			
		}
		
		else {
			return false;
		}
		}
		return ans;
		
		
	}

}
