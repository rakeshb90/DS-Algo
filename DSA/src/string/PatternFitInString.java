package string;

import java.util.HashMap;
import java.util.Map;

public class PatternFitInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		String pattern ="loe";
		helper(str,pattern);

	}

	private static void helper(String str, String pattern) {
		// TODO Auto-generated method stub
//		Map<Character,Integer> freqMap = new HashMap<>();
		int[] freqMap = new int[256]; 
		for(int i=0;i<pattern.length();i++) {
			freqMap[pattern.charAt(i)]++;
		}
//		Map<Character,Integer> strMap = new HashMap<>();
		int[] strMap = new int[256];
		int n=str.length(), i=0,j=0,matchedCount=0,minWinLen=Integer.MAX_VALUE,startWin=-1;
		while(j<n) {
			char ch = str.charAt(j);
			// expand window
			strMap[ch]++;
			
			// countmached characters
			if(freqMap[ch]!=0 && freqMap[ch]>=strMap[ch]) {
				matchedCount++;
			}
			// if strMap contains freqMap all keys with same or more value of each
			if(matchedCount == pattern.length()) {
				// start contracting
				// removing unwanted char(either does not exist in pattern or frequency is greater in string)
				while(freqMap[str.charAt(i)]==0 || freqMap[str.charAt(i)]<strMap[str.charAt(i)]){
					strMap[str.charAt(i)]--;
					i++;
				}
				// update start index and window length
				if(minWinLen>j-i) {
					startWin=i;
					minWinLen = j-i;
				}
			}
			j++;
		}
	System.out.println("Required String: "+str.substring(startWin,startWin+minWinLen+1));	
	}

}
