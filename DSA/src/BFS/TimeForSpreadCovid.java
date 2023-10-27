package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class TimeForSpreadCovid {

	public static void insertNodeToQueue(int[][] beds,Queue<Pair> queue,boolean[][] visited) {
		for(int i=0;i<beds.length;i++) {
			for(int j=0;j<beds[i].length;j++) {
				if(beds[i][j]==2 && !visited[i][j]) 
					queue.add(new Pair(i,j));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Example: There are three type of bed in a hospital 
//		0-> bad is empty
//		1-> bad having covid -ve patient
//		2-> bad having covid +ve patient
//
//		find the time when all covid -ve element get conttaminated by covid +ve.
//		Note: covid can not cross empty bed and not diagonaly bed.
//
//		Input: 1 1 1   at time t=1sec 1 2 1  at time t=2 sec  2 2 2  output: 2 seconds
//		       1 2 1                  2 2 2                   2 2 2
//			   1 1 1                  1 2 1                   2 2 2

		int[][] beds = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==j)
					beds[i][j] = 2;
				else
					beds[i][j] = 1;
			}
		}
		Queue<Pair> queue = new LinkedList<>();
		boolean[][] visited = new boolean[beds.length][beds[0].length];
		int time =0;
		insertNodeToQueue(beds,queue,visited);
		time++;
		int[] rowIncreament = {0,0,1,-1};
		int[] colIncreament = {1,-1,0,0};
		while(!queue.isEmpty()) {
		while(!queue.isEmpty()) {
			Pair p = queue.remove();
			int row=p.first;
			int col=p.second;
			
			for(int i=0;i<4;i++) {
				if(row+rowIncreament[i]<beds.length && row+rowIncreament[i]>=0 &&  
						col+colIncreament[i]<beds[0].length && col+colIncreament[i] >=0
						&& beds[row+rowIncreament[i]][col+colIncreament[i]]==1) {
					beds[row+rowIncreament[i]][col+colIncreament[i]]=2;
					visited[row+rowIncreament[i]][col+colIncreament[i]] = true;
				}
					
			}
			
		}
		time++;
		insertNodeToQueue(beds,queue,visited);
	}
		System.out.println("Time for affected: "+time);
	}
	
}
