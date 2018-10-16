package Lecture7;

import java.util.Scanner;

public class allindices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i]=s.nextInt();
		}
		int data=s.nextInt();
		int[] indices = allindices(arr , 0 ,0, data);
		for(int i= 0 ; i < indices.length ; i++) {
			System.out.println(indices[i]);
		}
		

	}
	public static int[] allindices(int[] arr , int si ,int count, int data) {
		if(si==arr.length) {
			int[] base= new int[count];
			return base;
		}
		
		int[] indices;
		if(arr[si]==data) {
			indices=allindices(arr , si+1 , count+1 , data);
		}
		else {
			indices=allindices(arr , si+1 , count , data);
		}
		if(arr[si]==data) {
			indices[count]=si;
		}
		return indices;
	}

}
