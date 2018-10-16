package Lecture2;

import java.util.Scanner;

public class Pattern{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,count=1;
		Scanner s=new Scanner (System.in);
		int n= s.nextInt();
		for(i=1 ; i<=n ; i++) {
			for(j=1 ; j<=i ; j++) {
				System.out.print(count+"\t");
				count++;
			}
			System.out.println();
		}
	}

}
