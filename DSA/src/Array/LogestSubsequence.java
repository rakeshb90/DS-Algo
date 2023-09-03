package Array;

import java.util.Stack;

public class LogestSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A[j]<A[i] where 0 <= j <= i
		int[] arr = {100,80,60,70,60,75,85};
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<arr.length;i++) {
			if(st.isEmpty() || arr[st.peek()] >= arr[i] ) {
				st.push(i);
			}
			else {
				while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
					ans[st.peek()] = i-st.peek();
					st.pop();
				}
				st.push(i);
			}
		}
	 for(int i=0;i<arr.length;i++)
	      System.out.print(arr[i]+" ");
	  System.out.println();
      for(int i=0;i<arr.length;i++)
    	  System.out.print(ans[i]+" ");
	}

}
