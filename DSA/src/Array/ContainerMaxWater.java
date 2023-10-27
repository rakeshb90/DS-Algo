package Array;

public class ContainerMaxWater {
	public static int getMaxWater(int[] arr) {
		int amoutWater = 0,minHeight = 0;
		int leftPointer = 0 , rightPointer = arr.length-1;
		while(leftPointer < rightPointer) {
			minHeight = Math.min(arr[leftPointer], arr[rightPointer]);
			amoutWater = Math.max(amoutWater, minHeight*(rightPointer-leftPointer)) ;
			if(arr[leftPointer] < arr[rightPointer])
				leftPointer++;
			else
				rightPointer--;		
		}
		return amoutWater;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Maximum Water: "+getMaxWater(new int[] {2,4,3,1,2,5,4}));
	}

}
