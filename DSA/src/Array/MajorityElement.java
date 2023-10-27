package Array;

public class MajorityElement {
	public static int majorityElement(int[] nums) {
        int n=nums.length,majorityEl=nums[0],count=1;
        for(int i=1;i<n;i++){
            if(majorityEl==nums[i])
            count++;
            else
            count--;

            if(count==0){
                majorityEl = nums[i];
                count = 1;
            }
        }

        return majorityEl;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Example 1:
//
//			Input: nums = [3,2,3]
//			Output: 3
//			Example 2:
//
//			Input: nums = [2,2,1,1,1,2,2]
//			Output: 2
			 
		int[] nums = {2,2,1,1,1,2,2};
       System.out.println("Majority Element: "+majorityElement(nums));
	}

}
