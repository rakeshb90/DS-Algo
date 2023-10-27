package exercise;

public class MaxMountain {
//
//	You may recall that an array arr is a mountain array if and only if:
//
//		arr.length >= 3
//		There exists some index i (0-indexed) with 0 < i < arr.length - 1 such that:
//		arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//		arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//		Given an integer array arr, return the length of the longest subarray, which is a mountain. Return 0 if there is no mountain subarray.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,6,1,2,3,4,5,4,3,2,0,1,2,3,-2,4};
		System.out.println("Maximum mountain: "+longestMountain(arr));

	}

	 public static int longestMountain(int[] arr) {
	        int n=arr.length,ans=0;
	        for(int i=1;i<=n-2;){
	            // check peek
	            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
	                // move backword
	                int countElement = 1;
	                int j=i;
	                
	                while(j>=1 && arr[j-1]<arr[j]){
	                    countElement++;
	                    j--;
	                }

	                // move forward
	                while(i<=n-2 && arr[i]>arr[i+1]){
	                    countElement++;
	                    i++;
	                }
	                ans = Math.max(countElement,ans);
	            }
	            else
	            i++;
	        }
	        return ans;
	    }
}
