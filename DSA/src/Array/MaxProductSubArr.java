package Array;

public class MaxProductSubArr {
	public  static int getMaxProduct(int[] arr) {
		int maxVal=1,minVal=1,maxProduct = Integer.MIN_VALUE;
		for(int i=0; i< arr.length;i++) {
			if(arr[i]<0) {
				int temp = maxVal;
				maxVal = minVal;
				minVal = temp;
			}
			minVal = Math.min(minVal*arr[i], arr[i]);
			maxVal = Math.max(maxVal*arr[i], arr[i]);
			maxProduct = Math.max(maxProduct, maxVal);
		}
		return maxProduct;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,-4,2,3,-5,1,2,-6};
		System.out.println("Max Product: "+getMaxProduct(arr));

	}

}
