package exercise;

import java.util.Arrays;

public class MinPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {-1,5,10,20,3};
		int[] arr2= {26,134,135,15,17};
		int pairEle1=0,pairEle2=0,diff=Integer.MAX_VALUE;
		Arrays.sort(arr2);
		for(int i=0;i<arr1.length;i++) {
			int lesserIndx = binarySearch(arr2,arr1[i],true);
			int greaterIndx = binarySearch(arr2,arr1[i],false);
			if(lesserIndx!=-1 && arr1[i]-arr2[lesserIndx]==0) {
				System.out.println("Min Pair: [ "+arr1[i]+", "+arr2[lesserIndx]+" ]");
				break;
			}
			
			if(lesserIndx != -1 && diff>arr1[i]-arr2[lesserIndx]) {
				pairEle1 = arr1[i];
				pairEle2 = arr2[lesserIndx];
				diff = arr1[i]-arr2[lesserIndx];
			}
			if(greaterIndx != -1 && diff>arr2[greaterIndx]-arr1[i]) {
				pairEle1 = arr1[i];
				pairEle2 = arr2[lesserIndx];
				diff = arr2[lesserIndx]-arr1[i];
			}
		}
		System.out.println("Min Pair: [ "+pairEle1+", "+pairEle2+" ]");

	}

	private static int binarySearch(int[] arr2, int valueToSearch, boolean isLower) {
		// TODO Auto-generated method stub
		int start=0,end=arr2.length-1;
		int index=-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr2[mid]==valueToSearch)
				return mid;
			else if(arr2[mid] < valueToSearch) {
				start = mid+1;
				if(!isLower)
					index = mid;
			}
			else {
				end = mid-1;
				if(isLower)
					index = mid;
			}
		}
		return index;
	}

}
