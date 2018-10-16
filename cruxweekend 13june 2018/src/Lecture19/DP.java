package Lecture19;

public class DP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=10;
			int[] strg=new int[n+1];
			
//			System.out.println(cbpRS(n ,0 , strg));
			System.out.println(cbpIS(n,0));
			}
	public static int cbpRS(int end , int curr , int[]strg) {
		if(curr==end) {
			return 1;
		}
		if(curr>end) {
			return 0;
		}
		if(strg[curr]!=0) {
			return strg[curr];
		}
		int count=0;
		for(int dice=1 ; dice<=6 ; dice++) {
			count=count+cbpRS(end  , curr+dice , strg);
	
		}
		strg[curr]=count;	
		return count;
		
		
	}
	public static int cbpIS(int end , int curr ) {
		
		int[] strg=new int[end+1];
		int count=0;
		strg[end]=1;
		strg[end-1]=1;
		int l;
		int k=0;
		for(int i=end-2 ; i>=0 ; i--) {
			l=i+1;
			k=0;
			for(int j=1 ; j<=6 ;j++) {
				if(l<strg.length) {
		           k=k+strg[l];
		           l++;				}
				
			}
			strg[i]=k;
		}
		return strg[0];
		
	}

}
