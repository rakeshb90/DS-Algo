package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,15};
		int sum = 18;
		List<List<Integer>> ans = getAllTriplet(arr,sum);
		for(int i=0;i<ans.size();i++) {
			System.out.print("[ "+ans.get(i).get(0)+" , "+ans.get(i).get(1)
					+" , "+ans.get(i).get(2)+" ] ");
			System.out.println();
		}

	}

	private static List<List<Integer>> getAllTriplet(int[] arr, int sum) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		int n=arr.length;
		for(int i=0;i<n-3;i++) {
			int l=i+1,r=n-1;
			while(l<r) {
				int val = arr[i]+arr[l]+arr[r];
				if(val==sum) {
					List<Integer> temp = new ArrayList<Integer>();
					temp.add(arr[i]);
					temp.add(arr[l]);
					temp.add(arr[r]);
					ans.add(temp);
					temp = null;
					l++;
					r--;
				}
				else if(val<sum)
					l++;
				else
					r--;
			}
		}
		return ans;
	}

}
