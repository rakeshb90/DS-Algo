package backtracking;

public class SudokuProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat= {{0,3,0,0,0,0,9,0,0},{0,0,6,0,0,0,0,0,0},{0,0,0,2,4,1,0,3,0}
		,{0,0,0,9,0,0,7,0,0},{0,0,0,0,0,2,0,0,4},{0,8,0,0,7,0,0,2,0},{8,5,0,0,0,0,0,0,0},
		{0,9,0,7,0,4,0,0,0},{0,0,0,0,0,6,0,0,1}};
		solveSudoku(mat,0,0);

	}

	private static boolean solveSudoku(int[][] mat, int i, int j) {
		// base case
		if(i==9) {
			printMatrixt(mat);
			return true;
		}
		// recursive case
		// if I am at end of row or after last column of current row
		if(j==9) {
			return solveSudoku(mat,i+1,0);
		}
		if(mat[i][j]!=0)
			return solveSudoku(mat,i,j+1);
			
		// place number if it is valid and reccursivelly solve rest
		for(int num=1;num<=9;num++) {
			if(canIplaced(mat,num,i,j)) {
				mat[i][j] = num;
				return solveSudoku(mat,i,j+1);
			}
			mat[i][j] = 0;
		}
		return false;
		
	}

	private static boolean canIplaced(int[][] mat, int num, int i, int j) {
		// Check in row && column
		for(int k=0;k<9;k++) {
			if(mat[i][k] == num || mat[k][j]== num)
				return false;
		}
		// check in sub matrix (3*3)
		int xs = (i/3)*3, ys = (j/3)*3;
		for(int x=xs;x<xs+3;x++) {
			for(int y=ys;y<ys+3;y++) {
				if(mat[x][y]==num) {
					return false;
				}
			}
		}
		return true;
	}

	private static void printMatrixt(int[][] mat) {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(mat[i][j]+" "); 
			}
			System.out.println();
		}
		
	}

}
