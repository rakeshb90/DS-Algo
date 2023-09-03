package Array;

public class KthMaxTwoSum {
	
	public static int getKthMaxVal(int[] A,int[] B,int k) {
		Triplate[] triplate = new Triplate[k];
		triplate[0] = new Triplate(A[0]+B[0],0,0);
		Triplate ans = triplate[0];
		int index = 0;
		while(k>1) {
			int first = triplate[index].first;
			int second = triplate[index].second;
			if(A[first]+B[second+1] > A[first+1]+B[second])
			triplate[index+1] = new Triplate(A[first]+B[second+1],first,second+1);
			else
			triplate[index+1] = new Triplate(A[first+1]+B[second],first+1,second);
			index++;
		}
		
		return triplate[k-1].sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {9,8,6,3,2}; // sorted array
		int[] B = {6,5,3,2,1}; // sorted array
		int k = 3; // Kth highest value A[i]+B[j]
		System.out.println("Kth Max value: "+getKthMaxVal(A,B,k));

	}

}
