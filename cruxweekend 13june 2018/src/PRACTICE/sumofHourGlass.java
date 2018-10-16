package PRACTICE;

import java.util.Scanner;

public class sumofHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int[][] arr=new int[6][6];
		for(int i=0 ; i<6 ; i++) {
			for( int j=0 ; j<6 ; j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int sum=Integer.MIN_VALUE;
		for(int i=0; i<4 ; i++) {
			for(int j=0 ; j<4 ; j++) {
				sum=hour(arr , i , j , sum);
			}
		}
		System.out.println(sum);
		String[] ar=new String[5];
		ar[1]="Hello";
		System.out.println(ar[1]);
			
		
	}
	public static int hour(int[][] arr , int i , int j, int sum) {
		int sum1=0;
		int k=i;
		while(k<i+3) {
			int l=j;
			while(l<j+3) {
				sum1=sum1+arr[k][l];
				l++;
			}
			k=k+2;
		}
		sum1=sum1+arr[i+1][j+1];
		if(sum1>sum) {
			return sum1;
		}else {
			return sum;
		}
	}

}
