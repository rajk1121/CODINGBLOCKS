package Lecture19;

import java.util.Scanner;

public class PrimsAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int nodes=s.nextInt();
		int edge=s.nextInt();
		int[][] links=new int[edge][3];
		for(int i=0 ; i<edge ; i++) {
			links[i][0]=s.nextInt();
			links[i][1]=s.nextInt();
			links[i][2]=s.nextInt();
		}
		int start=s.nextInt();
		int ans = prims(nodes  , links , start);
		System.out.println(ans);

	}

	private static int prims(int nodes, int[][] links, int start) {
		// TODO Auto-generated method stub
		int[] costs=new int[nodes];
		boolean[] included=new boolean[nodes];
		for(int i=0 ; i<costs.length ; i++) {
			costs[i]=Integer.MAX_VALUE;
		}
		costs[start-1]=0;
		for(int i=0 ; i<nodes ; i++) {
		int minNode = min(costs , included);
		included[minNode-1]=true;
		for(int j=0 ;j<links.length ; j++) {
			if(links[j][0]==minNode ) {
				if(!included[links[j][1]-1] && costs[links[j][1]-1] > links[j][2]) {
					costs[links[j][1]-1] = links[j][2];	
				}
			
			}
			if(links[j][1]==minNode) {
				if(!included[links[j][0]-1] && costs[links[j][0]-1] > links[j][2]) {
					costs[links[j][0]-1] = links[j][2];	
				}
			}
		}
		
		
		}
		int ans=0;
		for(int i=0 ; i<costs.length ; i++) {
//			System.out.println(costs[i]);
			ans=ans+costs[i];
			
		}
		return ans;
	}

	private static int min(int[] costs , boolean[] included) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE; 
		int minNode=0;
		for(int i=0 ; i<costs.length ; i++) {
			if(costs[i]<min && !included[i]) {
				min=costs[i];
				minNode=i+1;
			}
		}
		
		return minNode;
	}

}
