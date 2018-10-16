package PRACTICE;

import java.util.Scanner;

public class Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x=100;
//		 int p = (int)(Math.log(x)/(Math.log(2))); 
//		  x= (int)Math.pow(2, p);
////		x=x&(x-1);
//		System.out.println(x);
		Scanner s=new Scanner (System.in);
		long n=s.nextLong();
		
		String ans=counterGame(n, "Louise", "Richard");
		System.out.println(ans);
	}
	 static String counterGame(long n,String win,String loss) {
	        if(n==1){
	          return win;
	        }
	      long x=n&(n-1);
	      String ans="";
	      if(x==0){
	    	  if(n/2==1) {
	    		  return win;
	    	  }
	        ans=counterGame(n/2,loss,win);
	        return ans;
	      }else{
	        long y=1;
	        for(int i=0 ;i<64;i++){
	        y= y<<1;
	          if(y>n){
	        	  if(n-(y>>1)==1) {
	        		  return win;
	        	  }
	            ans=counterGame(n-(y>>1) , loss,win);
	            return ans;
	          }
	         
	        }
	      }
	    return ans;

	    }

}
