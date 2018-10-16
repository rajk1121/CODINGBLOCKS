package Lecture7;

import java.util.Scanner;

public class IndexRecursion {

	public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
int n=s.nextInt();
int ans=Triangle(n);
System.out.println(ans);
}
public static int Triangle(int n) {
	
	if(n==1 ) {
		return n;
	}
	
	
	int ans=Triangle(n-1)+n;
	return ans;
}

}