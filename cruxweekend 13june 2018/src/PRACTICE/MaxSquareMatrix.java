package PRACTICE;

public class MaxSquareMatrix {

	static int max = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] original = { { 1, 0, 1, 0, 0, 1 }, 
				{ 0, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 0, 0 },
				{ 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 1, 0 }

		};
		msmTab(original, 0, 0, original.length - 1, original[0].length - 1 , new int[6][6]);
		System.out.println(max);

	}

	private static int msmMemo(int[][] original, int sr, int sc, int dr, int dc,int[][] qb) {
		// TODO Auto-generated method stub
		if (sr == dr || sc == dc) {
			return original[sr][sc];
		}
		if(original[sr][sc]==0) {
			return 0;
		}
		if(qb[sr][sc]!=0){ 
			return qb[sr][sc];
		}else {
		int mh = msmMemo(original, sr, sc + 1, dr, dc ,qb);
		int mv = msmMemo(original, sr + 1, sc, dr, dc,qb);
		int md = msmMemo(original, sr + 1, sc + 1, dr, dc, qb);
		int ans = 1+ Math.min(mv, Math.min(mh, md));
		if (ans > max) {
			max = ans;
		}
		qb[sr][sc]=ans;
		
		return ans;

	}
	}
	public static void msmTab(int[][] original , int sr , int sc , int dr , int dc , int[][] qb) {
		
		for(int i=dr ; i>=0 ; i--) {
			for(int j=dc ; j>=0 ; j--) {
				if(j==dc||i==dr) {
					qb[i][j]=original[i][j];
				}else if(original[i][j]==0) {
					qb[i][j]=0;
				}
				else {
					qb[i][j]=1+ Math.min(qb[i+1][j+1], Math.min(qb[i+1][j], qb[i][j+1]));
					if(qb[i][j]>max) {
						max=qb[i][j];
					}
				}
				
				
			}
		}
		
		
	}

}
