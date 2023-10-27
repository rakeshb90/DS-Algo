package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllPairHavingTarget {
	
	public static List<List<Integer>> getAllPairs(int[] arr, int target){

		 int n = arr.length;
		 
		 Map<Integer,Integer> map = new HashMap<>();
		 List<List<Integer>> ans = new ArrayList<List<Integer>>();
		 if(n<=1)
		 return ans;
		 for(int i=0;i<n;i++){
		    if(map.containsKey(target-arr[i])){
			   List<Integer> temp = new ArrayList<>();
			   temp.add(target-arr[i]);
			   temp.add(arr[i]);
			   ans.add(temp);
			}
			map.put(arr[i],i);
		 }
		 return ans;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,2,2,6,3,5};// 2,2,2,6,6  3,3,5,5
		int target = 8;
//		List<List<Integer>> ans = getAllPairs(arr,target);
		List<List<Integer>> ans = ligetAllPairUsingSorting(target,arr);
		for(List<Integer> pair : ans) {
			System.out.println("("+pair.get(0)+","+pair.get(1)+")");
		}

	}
	public static List<List<Integer>> ligetAllPairUsingSorting(int target,int[] arr) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Arrays.sort(arr);
		int i=0,j=arr.length-1;
		while(i<j) {
			int val = arr[i]+arr[j];
			if(val==target) {
				if(arr[i]==arr[j]) {
					int cnt = factorial(j-i)/2;
					for(int k=0;k<=cnt;k++)
						ans.add(new ArrayList(Arrays.asList(new Integer[] {arr[i],arr[i]})));
				}
				else {
					int x=1,y=1;
					while(i<arr.length-1 && arr[i]==arr[i+1]) {
						x++;
						i++;
					}
					while(j>0 && arr[j]==arr[j-1]) {
						y++;
						j--;
					}
					for(int k=0;k<=x*y;k++)
						ans.add(new ArrayList(Arrays.asList(new Integer[] {arr[i],arr[j]})));					
				}
			}
			else if(val>target) {
				j--;
			}
			else
			i++;
		}
		return ans;
	}
	public static int factorial(int val) {
		if(val == 0 || val == 1)
			return 1;
		return val * factorial(val-1);
	}

}
