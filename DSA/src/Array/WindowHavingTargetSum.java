package Array;

public class WindowHavingTargetSum {
	
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,2,1,4,1,3,2,1,1};
		int target = 8;
//		printAllWindow(arr,target);
		printMinSizeWindow(arr,target);

	}

	private static void printMinSizeWindow(int[] arr, int target) {
		// TODO Auto-generated method stub
		int i=0,j=0,currSum=0,leftIndex=0,rightIndex=arr.length;
		while(j<arr.length) {
			
			// Expend from right
			currSum+=arr[j];
			j++;
			
			// Shrink the window
			while(currSum>target && i<j) {
				currSum-=arr[i];
				i++;
			}
			if(currSum==target) {
				if(j-i-1 < rightIndex-leftIndex) {
					leftIndex = i;
					rightIndex = j-1;
				}
			}
		}
		System.out.println(String.format("Window exist start from index %s and ending index %s", 
				leftIndex,rightIndex));	
	}

	private static void printAllWindow(int[] arr, int target) {
		// TODO Auto-generated method stub
		int i=0,j=0,currSum=0;
		while(j<arr.length) {
			
			// Expend from right
			currSum+=arr[j];
			j++;
			
			// Shrink the window from left
			while(currSum>target && i<j) {
				currSum-=arr[i];
				i++;
			}
			if(currSum==target) {
				System.out.println(String.format("Window exist start from index %s and ending index %s", 
						i,j-1));
			}
		}
		
	}

}
