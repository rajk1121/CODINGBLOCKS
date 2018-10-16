package Lecture1;

import java.util.Scanner;

public class isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int j,k,count;
		count=0;
		int n=s.nextInt();
		if(n==0) {
			System.out.println("INVALID");
		}
		for(j=1 ; j<=n ; j++)
		{
			k=n%j;
			if(k==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("PRIME");
		}else {
			System.out.println("NOT PRIME");
		}
				

	}

}
