package Array;

public class NextPermutaion {
	// Find the break-point, i: Break-point means the first index i from the back of the given array where arr[i] becomes smaller than arr[i+1].
	// For example, if the given array is {2,1,5,4,3,0,0}, the break-point will be index 1(0-based indexing). Here from the back of the array, index 1 is the first index where arr[1] i.e. 1 is smaller than arr[i+1] i.e. 5.
	// To find the break-point, using a loop we will traverse the array backward and store the index i where arr[i] is less than the value at index (i+1) i.e. arr[i+1].
	// If such a break-point does not exist i.e. if the array is sorted in decreasing order, the given permutation is the last one in the sorted order of all possible permutations. So, the next permutation must be the first i.e. the permutation in increasing order.
	// So, in this case, we will reverse the whole array and will return it as our answer.
	// If a break-point exists:
	// Find the smallest number i.e. > arr[i] and in the right half of index i(i.e. from index i+1 to n-1) and swap it with arr[i].
	// Reverse the entire right half(i.e. from index i+1 to n-1) of index i. And finally, return the array.
  public static int[] reverseArr(int[] arr,int index) {
	  int n=arr.length,l=index,r=n-1;
	  while(l<=r) {
		  int temp = arr[l];
		  arr[l] = arr[r];
		  arr[r] = temp;
		  l++;
		  r--;
	  }
	  return arr;
  }
	// input: 2,1,5,4,3,0,0 output: 2,3,0,0,1,4,5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,1,5,4,3,0,0};
		int n = arr.length,i=n-2,index=-1;
		while(i>=0) {
			if(arr[i]<arr[i+1]) {
				index = i;
				int secMinIndex= -1;
				for(int k=n-1;k>index;k--) {
					if(arr[k]>arr[index]) {
						secMinIndex = k;
						break;
					}
				}
				int temp = arr[index];
				arr[index] = arr[secMinIndex];
				arr[secMinIndex] = temp;
				arr = reverseArr(arr,index+1);
				break;
			}
			i--;
		}
		if(index==-1)
			arr = reverseArr(arr,0);
		
	   for(int x:arr)
		   System.out.print(x+" ");

	}

}
