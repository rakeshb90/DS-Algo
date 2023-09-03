package Array;

public class MaxSumSubArr {
	// Kadane's Algorithm
	public static int getMaxsum(int[] arr) {
		int currSum=0,maxSum=Integer.MIN_VALUE;
		for(int index=0;index<arr.length;index++) {
			currSum = Math.max(currSum+arr[index], arr[index]);
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,-2,0,9,-5,3,8,0,-6,10};
		System.out.println("Max Sum: "+getMaxsum(arr));
		
	}

}
