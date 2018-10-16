package Lecture10;

import java.util.Scanner;

public class lexico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner s=new Scanner (System.in);
		int end=s.nextInt();
		int curr=0;
		lexico(curr , end);

	}
	public static void lexico(int curr , int end) {
		if(curr>end) {
			return;
		}
		System.out.print(curr+" ");
		
		
		for(int i=(curr==0?1:0) ; i<10 ; i++) {
			lexico(curr*10+i , end);
			
		}
		
}

}