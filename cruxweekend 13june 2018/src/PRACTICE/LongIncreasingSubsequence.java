package PRACTICE;

import java.util.Scanner;

public class LongIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0 ; i<n;i++) {
			arr[i]=s.nextInt();
			
		}
		int[] length=new int[n];
		String[] ss=new String[n];
	//	int ans=LISm(arr,length,ss,0);
		for(int i=0 ; i<arr.length;i++) {
			length[i]=1;
			ss[i]=""+arr[i];
		}
		
		LISm(arr,length,ss,n-1);
		int ans=0;
		int length1=0;
		for(int i=0;i<arr.length;i++) {
			if(length1<length[i]) {
				ans=i;
			}
		}
		System.out.println(length[ans]);
		System.out.println(ss[ans]);

	}

	private static int LIS(int[] arr, int[] length, String[] ss) {
		// TODO Auto-generated method stub
		int index=0;
		int length1=1;
		for(int i=0;i<arr.length;i++) {
			length[i]=1;
			ss[i]=""+arr[i];
		}
	
		for(int i=0 ;i<arr.length;i++) {
			length1=1;
			for(int j=0 ; j<i;j++) {
				if(arr[i]>arr[j]) {
					if(length[j]>=length1) {
						length[i]=length[j]+1;
						ss[i]=ss[j]+" "+arr[i];
						length1=length[j];
					}
				}
				
			}
		}
		length1=0;
		for(int i=0;i<arr.length;i++) {
			if(length1<length[i]) {
				length1=length[i];
				index=i;
			}
		}
		return index;
		
		
		
		
	}
	public static void LISm(int[]arr , int[] length, String[] ss,int i) {
		if(i==-1) {
			return;
		}
		if(length[i]!=1 ) {
			return;
		}
		
		for(int j=i-1 ; j>=0;j--) {
			if(arr[i]>arr[j]) {
				LISm(arr , length,ss,j);
				ss[i]=ss[j]+" "+arr[i];
				length[i]=length[j]+1;
			}
			
		}
		
		
	}

}
