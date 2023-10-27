package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,2,4,8,5,1,-3};
		int sum = 7;
		List<Integer> ans = findPairBruitForce(arr,sum);
		System.out.print("[ "+ ans.get(0)+" ");
		System.out.print(ans.get(1)+" ] ");
		ans = findPairBetterApproach(arr,sum);
		System.out.print("[ "+ ans.get(0)+" ");
		System.out.print(ans.get(1)+" ] ");
		ans = findPairBestApproach(arr,sum);
		System.out.print("[ "+ ans.get(0)+" ");
		System.out.print(ans.get(1)+" ] ");
			

	}

	private static List<Integer> findPairBestApproach(int[] arr, int sum) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> ans = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(sum-arr[i])) {
				ans.add(arr[i]);
				ans.add(arr[map.get(sum-arr[i])]);
				return ans;
			}
			map.put(arr[i], i);
		}
			
		return ans;
	}

	private static List<Integer> findPairBetterApproach(int[] arr, int sum) {
		Arrays.sort(arr);
		List<Integer> ans = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			int index = binarySearch(arr,sum-arr[i]);
			if(index != -1) {
				ans.add(arr[i]);
				ans.add(arr[index]);
				return ans;
			}
		}
			
		return ans;
	}

	private static int binarySearch(int[] arr, int sum) {
		// TODO Auto-generated method stub
		int s=0,e=arr.length-1;
		while(s<=e) {
			int mid = (s+e)/2;
			if(arr[mid] == sum)
				return mid;
			else if(arr[mid]<sum)
				s=mid+1;
			else
				e = mid -1;
		}
		return -1;
	}

	private static List<Integer> findPairBruitForce(int[] arr, int sum) {
		// TODO Auto-generated method stub
		List<Integer> ans=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == sum) {
					ans.add(arr[i]);
					ans.add(arr[j]);
					return ans;
				}
					
			}
		}
		return ans;
	}

}
