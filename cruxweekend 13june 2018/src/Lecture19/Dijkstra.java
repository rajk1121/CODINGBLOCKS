package Lecture19;

public class Dijkstra {

	int[] costs;
	int[][] graphs;
	boolean[] included;
	public Dijkstra(int[][] graph , int n) {
		graphs=graph;
		costs=new int[n];
		included=new boolean[n];
		this.minpath();
	}
	private void minpath() {
		// TODO Auto-generated method stub
		costs[0]=0;
		for(int i=1;i<graphs.length;i++) {
			included[i]=false;
			costs[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<graphs.length-1;i++) {
			int index=this.minNode();
			included[index]=true;
			for(int j=0;j<graphs.length;j++) {
				if(graphs[index][j]!=0 && !included[j] && costs[index]+graphs[index][j]<costs[j] && costs[index]!=Integer.MAX_VALUE ) {
					costs[j]=costs[index]+graphs[index][j];
					
				}
			}
		}
		this.print();
		
	}
	private void print() {
		for(int i=1;i<graphs.length;i++) {
			System.out.println(i+"            "+costs[i]);
			
		}
		
	}
	private int minNode() {
		int index=0;
		int cost=Integer.MAX_VALUE;
		for(int i=0 ; i<graphs.length;i++) {
			if(costs[i]<cost && !included[i]) {
				cost=costs[i];
				index=i;
			}
			
		}
		return index;
		
	}
	

}
