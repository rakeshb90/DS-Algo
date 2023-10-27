package Array;

public class SortingArray {
	public static int partitionArr(int[] arr,int startIndex,int endIndex) {
		int pivot = arr[endIndex];
		int partitionIndex = startIndex;
		for(int index = startIndex;index<endIndex; index++) {
			if(arr[index] <= pivot) {
				int temp = arr[index];
				arr[index] = arr[partitionIndex];
				arr[partitionIndex] = temp;
				partitionIndex++;
			}	
		}
		// swap endIndex with partitionIndex 
		int temp = arr[endIndex];
		arr[endIndex] = arr[partitionIndex];
		arr[partitionIndex] = temp;
		
		return partitionIndex;
	}
	public static void quickSort(int[] arr,int startIndex,int endIndex) {
		if(startIndex >= endIndex) return;
		int partitionIndex = partitionArr(arr,startIndex,endIndex);
		quickSort(arr,startIndex,partitionIndex-1);
		quickSort(arr,partitionIndex+1,endIndex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,6,9,2,3,10,18,4,5};
		for(int val:arr)
			System.out.print(val+" , ");
		quickSort(arr,0,arr.length-1);
		System.out.println();
		System.out.println("************Sorted***********");
		for(int val:arr)
			System.out.print(val+" , ");
		System.out.println();
	}

}
