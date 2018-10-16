package Lecture4;

import java.util.Scanner;

public class LinearSearch {
	public static long start;
	public static long end;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i]=i;
		}
		startAlgo();
		
		 System.out.println( BinarySearch(arr , n-50));
		System.out.println("the time by BS is "+endAlgo());
		startAlgo();
		System.out.println( LinearSearch(arr , n-50));
		System.out.println("the time by LS is "+endAlgo());
//		System.out.println(index);
		

	}
	public static void startAlgo() {
		start = System.currentTimeMillis();
	}

	public static long endAlgo() {
		end = System.currentTimeMillis();
		return end - start;
	}
	public static int LinearSearch(int [] arr, int data)
	{
		int i;
		for( i=0 ; i<=arr.length ; i++)
		{
			if(arr[i] == data) {
				return i;
			}
			
		}
		return 0;
	
	}
	
	public static int BinarySearch(int [] arr1 , int data) {
		int left=0;
		int mid;
		int right=arr1.length - 1;
		while(left<=right)
		{
			mid=(right+left)/2;
			if(arr1[mid]==data)
			{
				return mid;
			} else if(arr1[mid]>=data)
			{
				right=mid-1;
				if(arr1[right]==data)
				{
					return right;
				}
			}
			else
			{
				left=mid+1;
				if(arr1[left]==data)
				{
					return left;
				}
			}
			left++;
		}
		return 0;
	}

}
