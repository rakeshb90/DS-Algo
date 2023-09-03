package string;

public class PatternMatch {
	public static int[] getZarr(String str) {
		int len = str.length();
		int[] lenTracker = new int[len];
			int j=0,i=1,k;
			while(i<len) {
				j=0;
				k=i;
				boolean isMatched = false;
			while(j<i && i<len && str.charAt(j) == str.charAt(i) ) {
				i++;
				j++;
				isMatched = true;
			}
			i++;
			if(isMatched)
			lenTracker[k] = j;
			}
		return lenTracker;
	}
	public static int getPostionOfPattern(String str,String pattern) {
		String combine = pattern+"#"+str;
		int[] lenTracker = getZarr(combine);
		int len = combine.length();
			for(int index=0;index<len;index++) {
				if(lenTracker[index]==pattern.length()) {
					return index-pattern.length()-1;
				}
				
			}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "abcd",str="zabctrsdabcdgytrsed";
		System.out.println("************************Z Algorithm*****************");
		System.out.println("Pattern: "+pattern+", exist in string: "+str+", at index: "+
		getPostionOfPattern(str,pattern)); 
		//System.out.println(getZarr(pattern));

	}

}
