package PRACTICE;

import java.util.Scanner;

public class ArraySortedRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i]=s.nextInt();
		}
		boolean ans=isSorted(arr,arr[0],0);
		System.out.println(ans);
		

	}
	public static boolean isSorted(int[] arr,int num , int i) {
		
		if(i==arr.length-1) {
			return true;
		}
		boolean ans=false;
		if(arr[i+1]>=num) {
			ans=isSorted(arr , arr[i+1] , i+1);
		}else {
			return false;
		}
		return ans;
		
	}

}
