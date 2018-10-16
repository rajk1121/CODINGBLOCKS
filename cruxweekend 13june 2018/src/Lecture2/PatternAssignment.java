package Lecture2;

import java.util.Scanner;

public class PatternAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int nsp=n-1;
        int csp=1;
        int nst,cst;
        nst=n;
        cst=1;
        int row=1;
        while(row<=n)
        {
            cst=1;
            while(csp<=nsp)
            {
                System.out.print(" ");
                cst++;
            }
            nsp--;
            
            if(row==1)
            {
                while(cst<=nst)
                {
                    System.out.print("*");
                    cst++;
                }
            }
            else{
                if(row==n)
                {
                    cst=1;
                    nst=n;
                    while(cst<=nst){
                    System.out.print("*");
                    }
                }
                
                else{
                    cst=1;
                    while(cst<=nst)
                    {
                        if(cst==1 || cst==nst)
                        {
                            System.out.print("*");
                        }
                        else{
                            
                        csp=1;
                        nsp=n-1;
                            while(csp<=nsp)
                            {
                                System.out.print(" ");
                                csp++;
                            }
                            
                            
                        }
                        cst++;
                    }
                }
            }
            }

        System.out.println();
        row++;
            }
        }
	


