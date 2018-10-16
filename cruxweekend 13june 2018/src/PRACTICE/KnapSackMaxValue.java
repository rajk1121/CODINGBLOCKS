package PRACTICE;

public class KnapSackMaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v= {60,100,120};
		int[] w= {10,20,30};
		int W=50;
		int ans=KnapSackMemo(W,v,w,w.length,new int[W+1][w.length+1]);
		int ans1=KnapSackTab(W,v,w,w.length,new int[w.length+1][W+1]);
		System.out.println(ans);
		System.out.println(ans1);

	}

	private static int KnapSackTab(int W, int[] v, int[] w, int length, int[][] qb) {
		// TODO Auto-generated method stub
		
		for(int i=0 ;i<=length ;i++) {
			for(int j=0 ; j<=W;j++) {
				if(i==0 || j==0) {
					qb[i][j]=0;
				}else if(w[i-1]<=j){
					qb[i][j]=Math.max(qb[i-1][j-w[i-1]]+v[i-1], qb[i-1][j]);
					
				}else {
					qb[i][j]=qb[i-1][j];
				}
			}
		}
		return qb[length][W];
//		int i=0,w=0;
//		for (i = 0; i <= n; i++) 
//	     { 
//	         for (w = 0; w <= W; w++) 
//	         { 
//	             if (i==0 || w==0) 
//	                  K[i][w] = 0; 
//	             else if (wt[i-1] <= w) {
//	                   K[i][w] = Math.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
//	             System.out.println(w-wt[i-1]);
//	             }	             else
//	                   K[i][w] = K[i-1][w]; 
//	         } 
//	      } 
//	       
//	      return K[n][W];
	}

	private static int KnapSackMemo(int W, int[] v, int[] w, int n,int[][] qb) {
		// TODO Auto-generated method stub
		if(n<=0|| W<0) {
			return 0;
		}
		if(qb[W][n]!=0) {
			return qb[W][n];
		}
		if(w[n-1]>W) {
			return KnapSackMemo(W, v, w, n-1,qb);
		}
		int ans=KnapSackMemo(W-w[n-1], v, w, n-1,qb)+v[n-1];
		int ans2=KnapSackMemo(W, v, w, n-1,qb);
		qb[W][n]=Math.max(ans, ans2);
		
		return Math.max(ans, ans2);
	}

}
