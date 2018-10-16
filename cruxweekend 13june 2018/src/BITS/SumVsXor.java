package BITS;

import java.util.Scanner;

public class SumVsXor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			long n=s.nextLong();
			long result1 = Sum(n);
			System.out.println(result1);
			long result = SumF(n);
			System.out.println(result);
	}
 
	private static long Sum(long n) {
		// TODO Auto-generated method stub
		   long ans = 0 ;
           for(long i = 0 ; i <= n ; i++ ){
             if(( n ^ i) == ( n + i )){
               ans++;
             }
           }
     return ans;
	}
	public static long SumF(long n) {
		int count=1;
		int power=1;
		int pos=1;
		int number=1;
		int no1=0;
		while(n!=0) {
			if((n|number) == n) {
				no1++;
				power=power*2;
				pos++;
			}else {
			count=count+power - (no1*(pos));
			power=power*2;
			pos++;
			}
			n=n>>1;
		}
		
		
		return count;
		
		
	}

}
