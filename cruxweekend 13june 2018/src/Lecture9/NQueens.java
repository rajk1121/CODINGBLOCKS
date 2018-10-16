package Lecture9;

import java.util.Scanner;

public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		boolean[][] board=new boolean[n][n];
		int count=countNQueens(board , 0);
		System.out.println(count);
		
	}
	public static int countNQueens(boolean[][] board ,  int row) {
		if(row==board.length) {
			return 1;
		}
		int way=0;
		for(int col=0 ; col<board[row].length ; col++) {
			if(isSafe(board , row , col)) {
				board[row][col]=true;
				way=way+countNQueens(board  , row+1);
				board[row][col]=false;
			}
		}
		return way;
	}
		
	public static boolean isSafe(boolean[][] board ,  int row, int col) {
		
		for(int i=row-1 ; i>=0 ; i--) {
			if (board[i][col]==true){
				return false;
			}
		}
		for(int i=row,j=col ; i>=0&&j>=0 ; i--,j--) {
			if (board[i][j]==true){
				return false;
			}
		}
		for(int i=row ,  j=col ; i>=0 && j<board.length ; i--,j++) {
			if (board[i][j]==true){
				return false;
			}
		}
		return true;
	}
}
