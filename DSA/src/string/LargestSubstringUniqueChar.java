package string;

import java.util.HashMap;
import java.util.Map;

public class LargestSubstringUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "rakeshbhaiya";
		printMaxSubstr(str);

	}

	private static void printMaxSubstr(String str) {
		// TODO Auto-generated method stub
		int i=0,j=0,winLen=0,startIndex=0,maxWinLen=0;
		Map<Character,Integer> map = new HashMap<>();
		while(j<str.length()) {
            char ch = str.charAt(j);
			// If char is present in current window
			if(map.containsKey(ch) && map.get(ch)>=i ) {
				
				i = map.get(ch)+1;// update starting index of window
				winLen = j-i;// update remaining window 
			}
			map.put(ch, j);
			winLen++;
			
			if(winLen > maxWinLen) {
				maxWinLen = winLen;
				startIndex=i;
			}
			j++;
		}
		
		System.out.println("Unique String: "+str.substring(startIndex,startIndex+maxWinLen));
	}

}
