package Lecture1;

import java.util.Scanner;

public class FibonacciTillN {

	 public static void main(String args[]) {
	        // Your Code Here
	        Scanner s=new Scanner (System.in);
	        int fn,sn,n,sum;
	        n=s.nextInt();
	        fn=0;
	        sn=1;
	        sum=0;
	        if(n==0) {
	            System.out.println(0);
	        }
	        else {
	            System.out.println(fn);
	        System.out.println(sn);
	        while(sum<=n) {
	            sum=fn+sn;
	            if(sum>n) {
	                return;
	            } else {
	            fn=sn;
	            sn=sum;
	            System.out.println(sum);
	            }
	            
	        }
	        }
	    }

}
