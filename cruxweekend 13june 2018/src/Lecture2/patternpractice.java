package Lecture2;

import java.util.Scanner;

public class patternpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner (System.in);
	        int n=s.nextInt();
	        int nst,cst,row,nst1,cst1,count=1;
	        row=1;
	        nst=n;
	        cst=1;
	        nst1=0;
	        cst1=1;
	        while(row<=n)
	        {
	            count=1;
	            cst=1;
	            while(cst<=nst)
	            {
	                System.out.print(count+" ");
	                count++;
	                cst++;
	            }
	            nst--;
	            cst1=1;
	            while(cst1<nst1)
	            {
	            	System.out.print("* ");
	            	cst1++;
	            }
	            nst1=nst1 + 2;
	            row++;
	            
	            System.out.println();
	        }

	}

}
