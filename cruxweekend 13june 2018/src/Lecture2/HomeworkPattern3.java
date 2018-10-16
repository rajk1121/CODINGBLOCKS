package Lecture2;

import java.util.Scanner;

public class HomeworkPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,k;
		Scanner s = new Scanner (System.in);
		n=s.nextInt();
		for(i=1 ; i<=n ; i++)
		{
			if(i==1 || i==n)
			{
				for(j=1 ; j<=n ;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(k=1 ; k<=n ; k++)
				{
					if(k==1 || k==n)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}

	}


}