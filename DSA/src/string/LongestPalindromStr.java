package string;

public class LongestPalindromStr {
	public static String getMaxPalindrom(String str,int leftIndex,int rightIndex) {
		// expand string till it valid palindrome 
		while(leftIndex>=0 && rightIndex<str.length()&&str.charAt(leftIndex) == 
				str.charAt(rightIndex)) {
			leftIndex--;
			rightIndex++;
		}

		return str.substring(leftIndex+1,rightIndex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ramraharm",longestStr=str.substring(0,1);
		for(int i=0;i<str.length();i++) {
			String palindrom = getMaxPalindrom(str,i,i);
			if(palindrom.length()>longestStr.length())
				longestStr = palindrom;
			palindrom = getMaxPalindrom(str,i,i+1);
			if(palindrom.length()>longestStr.length())
				longestStr = palindrom;
		}
     System.out.println("Longest Palindrom substring: "+longestStr);
	}

}
