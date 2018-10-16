package Lecture10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner s=new Scanner (System.in);
					int n=s.nextInt();
					int[] arr=new int[n];
					for(int i=0 ; i<n; i++) {
						arr[i]=s.nextInt();
					}
					int data=s.nextInt();
					int count=count1(arr , 0 , 0 , "" , data , 0);
					System.out.println(count);
					subset(arr , 0 , 0 , "" , data);
					
			}
			public static void subset(int[] arr , int j  , int sum ,  String res,int data ) {
			
			
				if(sum==data) {
					System.out.print(res+"  ");
					return;
				
				}
				if(sum>data) {
				return;
				}
				if(j==arr.length) {
				return;
				}
				
				
				String res1=new String();
				for(int i=j ; i<arr.length ; i++) {
					if(i==arr.length) {
				
					}
					res1=res;
					res1=res1+arr[i]+" ";
					int sum1=sum;
					sum1=sum1+arr[i];
					subset(arr , i+1 , sum1 , res1 , data );
				}
				return;
				
			}
			public static int count1(int[] arr , int j , int sum , String res , int data , int count) {

				
				if(sum==data) {
					count++;
					return count;
				
				}
				if(sum>data) {
				return count;
				}
				if(j==arr.length) {
				return count;
				}
				
				
				String res1=new String();
				for(int i=j ; i<arr.length ; i++) {
					if(i==arr.length) {
				
					}
					res1=res;
					res1=res1+arr[i]+" ";
					int sum1=sum;
					sum1=sum1+arr[i];
					count=count1(arr , i+1 , sum1 , res1 , data ,count);
				}
				return count;
				
			}
			}

	


