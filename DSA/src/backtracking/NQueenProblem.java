package backtracking;

public class NQueenProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Queen should be placed such that no queen should be there in row,column,diagonals
		int[][] board = new int[20][20];
		int n = 4;
		solveNQueenProblem(board,n,0);
	}

	private static void printBoard(int[][] board, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static boolean solveNQueenProblem(int[][] board, int n, int i) {
		// base case
		if(i==n) {
			printBoard(board,n);
			return true;
		}
		// recursive case
		for(int j=0;j<n;j++) {
			if(canPlace(board,n,i,j)) {
				board[i][j]=1;
				boolean success = solveNQueenProblem(board,n,i+1);
				if(success) {
					return true;
				}
				board[i][j]=0;
			}
		}
			
		return false;
	}

	private static boolean canPlace(int[][] board, int n, int i, int j) {
		
		// we have to check only upper three directions (two half-diagonals and column)
		// as in each row only one queen can be placed and below of current row we have
		// not placed any queen so no check required.
		
		// column check
		for(int k=i;k>=0;k--) {
			if(board[k][j]==1)
				return false;
		}
		// left-up diagonal
		int r=i,c=j;
		while(r>=0 && c>=0) {
			if(board[r][c]==1)
				return false;
			r--;
			c--;
		}
		// right-up diagonal
		r=i;
		c=j;
		while(r>=0 && c<n) {
			if(board[r][c]==1)
				return false;
			r--;
			c++;
		}
		return true;
	}

}
