package exercise;

public class AngryBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nestCnt=5,birds=3;
		int[] nest= {1,2,4,8,9};
		System.out.println("Largest minimum distance possible among them: "
		+getLargestSpace(nestCnt,birds,nest));

	}

	private static int getLargestSpace(int nestCnt, int birds, int[] nest) {
		// TODO Auto-generated method stub
		int start=0,end=nest[nest.length-1]-nest[0];
		int ans = -1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(isPossibleSpace(nest,birds,mid)) {
				ans = mid;
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return ans;
	}

	private static boolean isPossibleSpace(int[] nest, int birds,int mid) {
		// TODO Auto-generated method stub
		int n=nest.length,birdCount=1,lastLocation=nest[0];
		for(int i=1;i<n;i++) {
			int currentLocation=nest[i];
			if(currentLocation-lastLocation>=mid) {
				birdCount++;
				lastLocation=currentLocation;
			}
			if(birdCount>=birds)
				return true;
		}
		
		return false;
	}

}
