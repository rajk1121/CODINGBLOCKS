package PRACTICE;

import java.util.Scanner;


public class PalindromicSubstring {
	static int ans=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		
		boolean[][] ans1=new boolean[s1.length()][s1.length()];
		palstrTab(ans1 , s1 );
		System.out.println(ans);
	}
	private static void palstrTab(boolean[][] ans2, String s1) {
		// TODO Auto-generated method stub
		
		for(int i=0 ; i<s1.length() ; i++) {
			
			int x=0;
			for(int j=i;j<s1.length();j++) {
				if(x==j) {
					ans2[x][j]=true;
					ans++;
					x++;
				}else {
					if(s1.charAt(x)==s1.charAt(j)) {
						if(j-x==1) {
							ans2[x][j]=true;
						ans++;
						}
						else if(ans2[x+1][j-1]) {
							ans2[x][j]=true;
							ans++;
							
						}else {
							ans2[x][j]=false;
						}
					}
					
					x++;
				}
			}
		}
		
		
	}

}
