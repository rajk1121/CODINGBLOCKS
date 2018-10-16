package Lecture9;

import java.util.Arrays;
import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int[] one=new int[n];
		int m=s.nextInt();
		int[] two=new int[m];
		for(int i=0 ; i<n ; i++) {
			one[i]=s.nextInt();
		}
		for(int i=0 ; i<m ; i++) {
			two[i]=s.nextInt();
		}
		int l=n+m;
		int[] three=new int[l];
		
		three=Mer(one , two , l);
		for(int i=0 ; i<l ; i++) {
			System.out.println(three[i]);
		}
		

	}
	public static int[] Mer(int[] one , int[] two , int l){
		int j=0 , k=0;
		int[] three=new int[l];
		for(int i=0; i<l ; i++) {
			if(j<one.length) {
			if(one[j]<two[k]) {
				three[i]=one[j];
				j++;
			}
			else if(one[j]>two[k]) {
				three[i]=two[k];
				k++;
			}
			}
			else {
				three[i]=two[k];
				k++;
			}
		}
		return three;
	}

}
