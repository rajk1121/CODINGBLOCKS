package Lecture2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int i,j=0,l;
				int k=0;
				Scanner s=new Scanner (System.in);
				int n=s.nextInt();
				
				System.out.println();
				for(i=n ; i>=1; i--)
				{
					for(j=0 ; j<k ; j++)
					{
						System.out.print(" ");
						
						
					}
						for(l=1 ; l<=i ; l++)
					{
						System.out.print("*");
					}
					System.out.println();
					k=k+2;
				}
					
					
					
					
						
				
	}

}
