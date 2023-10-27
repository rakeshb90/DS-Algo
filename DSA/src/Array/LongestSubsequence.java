package Array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubsequence {
	public static int longestConsecutive(int[] nums) {
        Map<Integer,Integer> lookup = new HashMap<>();
        int ans =1,n=nums.length;
        if(n <= 1)
        return n;
        // add to lookup
        for(int i=0;i<n;i++)
        lookup.put(nums[i],i);

        for(int i=0;i<n;i++){
            // check starting of band
            if(!lookup.containsKey(nums[i]-1)){
                int count = 1;
                int val = nums[i]+1;
                while(lookup.containsKey(val)){
                    count++;
                    val++;
                }
                ans = Math.max(ans,count);
            }

        }
        return ans;
    }
/*
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,9,3,0,18,5,2,4,10,7,12,6};
		System.out.println("Band with max size: "+longestConsecutive(arr));

	}

}
