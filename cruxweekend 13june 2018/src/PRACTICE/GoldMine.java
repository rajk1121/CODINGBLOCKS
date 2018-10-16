package PRACTICE;

public class GoldMine {
	static int max=0;
	static int x=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] cost= {
				{2,6,0,5},
				{0,7,5,2},
				{3,0,3,7},
				{8,0,2,3}
		};
		int[][]qb=new int[cost.length][cost[0].length];
		for(int i=0 ; i<cost.length  ;i++) {
		goldmineMem(cost , i , 0 , cost.length-1 , cost[0].length-1 , qb);
		}
//		for(int i=0 ; i<cost.length  ;i++) {
//			goldmine(cost , i , 0 , cost.length-1 , cost[0].length-1 );
//			}
		System.out.println(max);
	}
	public static int goldmine(int[][] cost, int cr, int cc, int dr, int dc) {
		// TODO Auto-generated method stub
		
		if(cc==dc ) {
			return cost[cr][cc];
		}
		x++;
		System.out.println(x);
		if(cr==0) {
			int mh=goldmine(cost, cr, cc+1, dr, dc);
			int md=goldmine(cost, cr+1, cc+1, dr, dc);
			int ans=cost[cr][cc]+Math.max(mh, md);
			if(ans>max) {
				max=ans;
			}
			return ans;
		}else 	if(cr==dr) {
			int mh=goldmine(cost, cr, cc+1, dr, dc);
			int md=goldmine(cost, cr-1, cc+1, dr, dc);
			int ans=cost[cr][cc]+Math.max(mh, md);
			if(ans>max) {
				max=ans;
			}
			return ans;
		}else {
			int mh=goldmine(cost, cr, cc+1, dr, dc);
			int md=goldmine(cost, cr+1, cc+1, dr, dc);
			int md1=goldmine(cost, cr-1, cc+1, dr, dc);
			int ans=cost[cr][cc]+Math.max(mh, Math.max(md, md1));
			if(ans>max) {
				max=ans;
			}
			return ans;
		}
		
	}
	public static int goldmineMem(int[][] cost, int cr, int cc, int dr, int dc , int[][] qb) {
		// TODO Auto-generated method stub
		
		if(cc==dc ) {
			return cost[cr][cc];
		}
		if(qb[cr][cc]!=0) {
			return qb[cr][cc];
		}
//		X++;
//		SYSTEM.OUT.PRINTLN(X);
		if(cr==0) {
			int mh=goldmineMem(cost, cr, cc+1, dr, dc,qb);
			int md=goldmineMem(cost, cr+1, cc+1, dr, dc,qb);
			int ans=cost[cr][cc]+Math.max(mh, md);
			if(ans>max) {
				max=ans;
			}
			qb[cr][cc]=ans;
			return ans;
		}else 	if(cr==dr) {
			int mh=goldmineMem(cost, cr, cc+1, dr, dc,qb);
			int md=goldmineMem(cost, cr-1, cc+1, dr, dc,qb);
			int ans=cost[cr][cc]+Math.max(mh, md);
			if(ans>max) {
				max=ans;
			}
			qb[cr][cc]=ans;
			return ans;
		}else {
			int mh=goldmineMem(cost, cr, cc+1, dr, dc,qb);
			int md=goldmineMem(cost, cr+1, cc+1, dr, dc,qb);
			int md1=goldmineMem(cost, cr-1, cc+1, dr, dc,qb);
			int ans=cost[cr][cc]+Math.max(mh, Math.max(md, md1));
			if(ans>max) {
				max=ans;
			}
			qb[cr][cc]=ans;
			return ans;
		}
		
	}

}
 