package PRACTICE;

import java.util.Scanner;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		long[] c=new long[n];
		for(int i=0 ; i<n ; i++) {
			c[i]=s.nextInt();
		}
		int data=s.nextInt();
		long ans=getWays(data , 0,0 ,c,new long[data+1]);
		System.out.println(ans);

	}

	private static long getWays(int data, long sum,int j, long[] c,long[] qb) {
		// TODO Auto-generated method stub
		if(sum>data) {
			return 0;
		}
		if(sum==data) {
			return 1;
		}
		long count=0;
		for(int i=j ; i<c.length ; i++) {
			count=count+getWays(data, sum+c[i],i, c,qb);
		}	
		return count;
	
	}
	}

