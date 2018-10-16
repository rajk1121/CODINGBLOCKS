package Lecture3;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int again;
		do {
		Scanner s=new Scanner (System.in);
		int num=s.nextInt();
		int n=s.nextInt();
		int m=num;
		int count=0;
		while(m!=0)
		{
			m=m/10;
			count++;
		}
		if(n>0) {
		
		int k=1;
		
		while(k<=n)
		{
			int count1=count;
			int l=num;
			int o=num;
		    l=l/10;
		    o=o%10;
		    
		    while(count1>1)
		    {
		    	o=o*10;
		    	count1--;
		    }
		    o=o+l;
		    k++;
		    num=o;
		   
		    
			
		}
		System.out.println(num);
		}
		else
		{
		n=-n;
		int k=1;
		
		while(k<=count-n)
		{
			int count1=count;
			int l=num;
			int o=num;
		    l=l/10;
		    o=o%10;
		    
		    while(count1>1)
		    {
		    	o=o*10;
		    	count1--;
		    }
		    o=o+l;
		    k++;
		    num=o;
		   
		    
			
		}
		System.out.println(num);
		}
		System.out.println("Enter again");
		
		again=s.nextInt();
		
		}
		while(again==1);
	}
	
	
}
