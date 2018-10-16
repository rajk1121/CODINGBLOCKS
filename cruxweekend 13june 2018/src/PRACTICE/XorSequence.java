package PRACTICE;

import java.util.Scanner;

public class XorSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner s=new Scanner (System.in);
		int t=s.nextInt();
		for(int i=0 ; i<t ; i++) {
		long l=s.nextLong();
		long m=s.nextLong();
		long ans=Xor1(l,m);
//		System.out.println("**************");
//		long ans1=Xor1(l,m);
//		System.out.println("//////////////////////");
		System.out.println(ans);
//		System.out.println("//////////////////////");
//		System.out.println(ans1);
//		int x=0;
//		System.out.println("***************");
//		for(int j=0 ; j<500 ; j++) {
//			x=x^j;
//		System.out.println(x);
//		}
		}
	}
	

	private static long Xor(long l, long m) {
		// TODO Auto-generated method stub
		 long w,y,z;
		   y=0;
		    z=0;
		    w=l/10;
		    if(w%2==0) {
		      w=w*10;
		      if(w==l) {
		    	  z=l;
		      }
		      for(long i=w+1 ; i<=m ; i++) {
		      y=w^i;
		      if(i>=l) {
		        z=z^y;
//		        System.out.println(z);
		      }
		      w=y;
		    }
		    return z;
		    }else {
		      w=w*10+1;
		     
		      for(long i=w ; i<=m ; i++) {
		      y=w^i;
		      if(i>=l) {
		        z=z^y;
//		        System.out.println(z);
		      }
		      w=y;
		    }
		    return z;
		    }
		   
		    
	}
	private static long Xor1(long l , long m) {
		
		
		 long x,y,z;
		    x=0;
		    y=0;
		    z=0;
		    for(long i=0 ; i<=m ; i++) {
		      y=x^i;
		      if(i>=l) {
		        z=z^y;
//		        System.out.println(z);
		      }
		      x=y;
		    }
		    return z;
	}

}
