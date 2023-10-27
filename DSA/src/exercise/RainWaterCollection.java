package exercise;

public class RainWaterCollection {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		
        System.out.println("Total water collected: "+getRainWater(arr));
	}

	private static int getRainWater(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		if(n<=1)
			return 0;
		int[] suffixMax = new int[n];
		suffixMax[n-1] = arr[n-1];
		
		for(int i=n-2;i>=0;i--)
			suffixMax[i] = Math.max(suffixMax[i+1], arr[i]);
		
		int max_left = arr[0],rainAmount=0;
		for(int i=0;i<n;i++) {
			max_left = Math.max(max_left, arr[i]);
			rainAmount += Math.min(max_left,suffixMax[i])-arr[i];
		}
			
		return rainAmount;
	}

}
