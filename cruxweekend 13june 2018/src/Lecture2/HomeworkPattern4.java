package Lecture2;

import java.util.Scanner;

public class HomeworkPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n,i,j,m;
			m=0;
			Scanner s = new Scanner (System.in);
			n=s.nextInt();
			if(n==0)
				
			{
				System.out.println("invalid");
			}
			if(n%2!=0) {
			for(i=1; i<=(n/2)+1 ; i++)
			{
				
				for(j=1 ; j<=(n-m) ; j++)
				{
					if(j==i || j==(n-m))
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
				m++;
			}
			m=2;
			for(i=(n/2)+2 ; i<=n ; i++)
			{
				for(j=1 ; j<=i ; j++)
				{
					if(j==i || j==(i-m))
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
				System.out.println();
				m=m+2;
				
			}
			}
			else
			{
				for(i=1; i<(n/2)+1 ; i++)
				{
					
					for(j=1 ; j<=(n-m) ; j++)
					{
						if(j==i || j==(n-m))
						{
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
						
					}
					System.out.println();
					m++;
				}
				m=1;
				for(i=(n/2)+1 ; i<=n ; i++)
				{
					for(j=1 ; j<=i ; j++)
					{
						if(j==i || j==(i-m))
						{
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
						
					}
					System.out.println();
					m=m+2;
					
				}
			}
			
	}
	

}
