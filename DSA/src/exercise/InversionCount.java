package exercise;

public class InversionCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// count all pair arr[i], arr[j] where arr[i]>arr[j] for 0<i<j
		int[] arr=  {0,5,2,3,1}; //{10,5,2,0,7,6,4};
		System.out.println("Inversion count is: "+inversin_count(arr,0,arr.length-1));

	}

	private static int inversin_count(int[] arr,int startIndex,int endIndex) {
		// TODO Auto-generated method stub
		if(startIndex>=endIndex)
		return 0;
		int mid = (startIndex+endIndex)/2;
		int countLeft = inversin_count(arr,startIndex,mid);
		int countRight = inversin_count(arr,mid+1,endIndex);
		int countCross = merge(arr,startIndex,endIndex);
		return countLeft+countRight+countCross;
	}

	private static int merge(int[] arr, int startIndex, int endIndex) {
		// TODO Auto-generated method stub
		int i=startIndex;
		int mid = (startIndex+endIndex)/2;
		int j=mid+1;
		int k=0;
		int count = 0;
		int[] tempArr = new int[endIndex-startIndex+1];
		while(i<=mid && j<=endIndex) {
			if(arr[i]<=arr[j]) {
				tempArr[k]=arr[i];
				i++;
			}
			else {
				count+=(mid-i+1);
				tempArr[k]=arr[j];
				j++;
			}
			k++;
		}
		while(i<=mid) {
			tempArr[k]=arr[i];
			i++;
			k++;
		}
		while(j<=endIndex) {
			tempArr[k]=arr[j];
			j++;
			k++;
		}
		k=0;
		for(i=startIndex;i<=endIndex;i++)
			arr[i]=tempArr[k++];
		return count;
	}

}
