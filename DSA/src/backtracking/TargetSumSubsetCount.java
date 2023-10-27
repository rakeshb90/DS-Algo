package backtracking;

public class TargetSumSubsetCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		int target = 6;//{1,2,3},{2,4},{6},{1,5}
		System.out.println("taget sum count is : "+getTargetSumCount(arr,0,target));

	}

	private static int getTargetSumCount(int[] arr, int i, int target) {
		// TODO Auto-generated method stub
		// base case
		if(i==arr.length) { // array(input space) get empty
			if(target==0) // target zero means we have achieve one way
				return 1;
			else
				return 0; // not get target value
		}
		
		// Recursive case
		int includeCurrent = getTargetSumCount(arr,i+1,target-arr[i]);
		int excludeCurrent = getTargetSumCount(arr,i+1,target);
		
		return includeCurrent+excludeCurrent;
	}

}
