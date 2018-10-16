package Lecture14;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		String beg="T1";
		String aux="T2";
		String end="T3";
		TOH(n,beg,aux,end);
		int count=count(n,beg,aux,end);
		System.out.println(count-1);
	}
	public static void TOH(int n, String beg, String aux, String end) {
		if(n==0) {
			return;
		}
//	if(n==1) {
//		System.out.println("Move "+n+"th disc from"+beg+" to "+end);
//		return;
//	}
		TOH(n-1,beg,end,aux);
		System.out.println("Move "+n+"th disc from"+beg+" to "+end);
		TOH( n-1 , end , aux, beg);
		
//		TOH(1,aux,beg,end);
		
		
	}
	public static int count(int n,String beg,String aux,String end) {
		int count=0;
		if(n==0) {
			return 1;
		}
		count+=count(n-1,beg,end,aux);
		count+=count(n-1,aux,beg,end);
		return count;
	}

}
