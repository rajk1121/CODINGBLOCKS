package Lecture3;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		int row=1;
		int csp=1;
		int nsp=0;
		int nst=n;
		int cst=1;
		while(row<=n)
		{
			csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			nsp=nsp+2;
			cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			nst--;
			row++;
			System.out.println();
		}
		row=1;
		nsp=nsp-4;
		nst=2;
		while(row<n)
		{
			csp=1;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			nsp=nsp-2;
			cst=1;
			
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			nst++;
			
			row++;
			System.out.println();
		}


	}

}
