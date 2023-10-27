package Array;

import java.util.TreeSet;

public class TriplateProduct {

//	A[] - array of integers 
//	Size - n 
//	A[i] > 0
//	Pick three indexes such that (i < j < k)  and (A[i] < A[j] < A[k])
//	Maximize the value of (A[i] * A[j] * A[k])
//	Example:
//	[6, 4 , 5 , 10] --> triplet will be {4,5,10} and answer = 200
//	[5, 4, 5, 3, 5] --> -1
//
//	max(A[i] * A[j] * A[k])
	public static void bruteForce(int[] arr) {
		int n = arr.length,max_product=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++)
				if(arr[i] < arr[j] && arr[j] < arr[k])
				max_product=Math.max(max_product, arr[i]*arr[j]*arr[k]);
			}
		}
      System.out.println("bruteForce => max_product: "+max_product);
	}

public static void betterSolution(int[] arr) {
	int n = arr.length,ans=-1;
	for(int i=1;i<n-1;i++) {
		int maxLeft=0,maxRight=0;
		for(int j=0;j<i;j++) {
			if(arr[j] < arr[i])
			maxLeft = Math.max(maxLeft, arr[j]);
		}
		for(int k=i+1;k<n;k++) {
			if(arr[i]<arr[k])
				maxRight = Math.max(maxRight, arr[k]);
		}
		if(maxLeft < arr[i] && arr[i] < maxRight )
		ans = Math.max(ans, maxLeft*arr[i]*maxRight);
	}
	System.out.println("betterSolution => max_product: "+ans);
}

public static void optimumSol(int[] arr) {
          int n= arr.length, ans=0;
          
          int[] suffixMax = new int[n+1];
          suffixMax[n] = 0;
          
          for(int i=n-1;i>=0;i--) {
        	  suffixMax[i] = Math.max(suffixMax[i+1], arr[i]);
          }
          
          TreeSet<Integer> trackPrefixMax = new TreeSet<>();
          trackPrefixMax.add(Integer.MIN_VALUE);
          
          for(int i=0;i<n-1;i++) {
        	  if(arr[i] < suffixMax[i]) {
        		  ans = Math.max(ans,trackPrefixMax.lower(arr[i])*arr[i]*suffixMax[i+1]);
        		  trackPrefixMax.add(arr[i]);
        	  }
          }
          System.out.println("optimumSol => max_product: "+ans);  
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Better approach:
		// consider arr[i] is middle element find max element which is lesser than arr[i] in left side
		// find max element greater than arr[i] in right side
		// Optumum approach:
		// Use suffix max array for right side value and tree set to get max value just lower than arr[i]
		// in left side of it
		int[] arr= {6, 4 , 5 , 10};
		bruteForce(arr);
		betterSolution(arr);
		optimumSol(arr);
	}
// Note : Same logic apply for Triplate sum also having this condition
}
