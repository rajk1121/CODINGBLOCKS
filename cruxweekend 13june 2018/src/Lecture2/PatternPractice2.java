package Lecture2;

import java.util.Scanner;

public class PatternPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int cst,nst,csp,nsp,row;
        nst=n/2+1;
        nsp=0;
        row=1;
        while(row<=n/2+1)
        {
            cst=1;
            csp=1;
            while(cst<=nst)
            {
                System.out.print("*\t");
                cst++;
            }
            while(csp<=nsp)
            {
                System.out.print("\t");
                csp++;
            }
            cst=1;
            csp=1;
            while(csp<=nsp)
            {
                System.out.print("\t");
                csp++;
            }
            while(cst<nst)
            {
                System.out.print("*\t");
                cst++;
            }
            
            row++;
            nst--;
            nsp++;
            System.out.println();
        }
        while(row<=n)
        {
        	
        }
	}
}

