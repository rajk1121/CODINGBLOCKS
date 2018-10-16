package PRACTICE;

import java.util.Scanner;

public class MinCostPath {
	static int counter=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int[][] cost=new int[n][n];
		for(int i=0 ; i<n ; i++) {
			for(int j=0 ; j<n ; j++) {
				cost[i][j]=s.nextInt();
			}
		}
		int stodm=mcpm(0, 0, cost.length-1, cost[0].length-1, cost, new int[n][n]);
	    System.out.println(counter);
		int stod=mcp(0, 0 , cost.length-1 , cost[0].length-1, cost);
		System.out.println(stod);
		System.out.println(counter);
	}

	private static int mcp(int cr, int cc, int er, int ec , int[][] cost) {
		// TODO Auto-generated method stub
		if(cc==ec&&cr==er) {
			return cost[cr][cc];
		}
		counter++;
		int ans=0;
		int mhp=Integer.MAX_VALUE;
		int mvp=Integer.MAX_VALUE;
		if(cr<er) {
			mhp=mcp(cr+1 , cc , er , ec , cost);
		}
		if(cc<ec) {
			mvp=mcp(cr , cc+1 , er , ec,cost);
		}
		 ans=Math.min(mhp, mvp)+ cost[cr][cc];
		return ans;
		
	}
	private static int mcpm(int cr, int cc, int er, int ec , int[][] cost , int[][] qb) {
		// TODO Auto-generated method stub
		if(cc==ec&&cr==er) {
			return cost[cr][cc];
		}
		if(qb[cr][cc]!=0) {
			return qb[cr][cc];
		}
		counter++;
		int ans=0;
		int mhp=Integer.MAX_VALUE;
		int mvp=Integer.MAX_VALUE;
		if(cr<er) {
			mhp=mcpm(cr+1 , cc , er , ec , cost ,qb);
		}
		if(cc<ec) {
			mvp=mcpm(cr , cc+1 , er , ec,cost , qb);
		}
		 ans=Math.min(mhp, mvp)+ cost[cr][cc];
		 qb[cr][cc]=ans;
		return ans;
		
	}

}
