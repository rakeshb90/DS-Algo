package exercise;

public class QuickSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// select Kth smallest element in arr
		int[] arr = {10,5,2,0,7,6,4};
	    int k=5;
	    System.out.println("Kth smallest element: "+arr[getIndex(arr,0,arr.length-1,k)]);

	}
	public static int partition(int[] arr,int s,int e) {
		int pivot = arr[e];
		int i=s-1;
		for(int j=s;j<=e;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp =arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		i++;
		int temp =arr[e];
		arr[e] = arr[i];
		arr[i] = temp;
		return i+1;
	}

	private static int getIndex(int[] arr,int s,int e, int k) {
		// TODO Auto-generated method stub
		if(s>=e)
			return s;
		int p = partition(arr,s,e);
		if(p==k-1)
		return p;
		if(p<k-1)
		 return getIndex(arr,p+1,e,k);
		else
		 return getIndex(arr,s,p-1,k);
	}

}
