package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortedSubsequence {
	
	class LexicoWithLengthComparator implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			String s1 = (String) o1;
			String s2 = (String) o2;
			if(s1.length()<s2.length())
				return -1;
			else if(s1.length()>s2.length())
			    return 1;
			else
				return s1.compareTo(s2);
		}
		
	}
	
	public static void produceSubsequence(ArrayList<String> strs,String sample) {
	  int n = sample.length();
	  for(int num=0;num<(1<<n);num++) {
		  String subSeq = "";
		  for(int index=0;index<n;index++) {
			  if((num & (1<<index))!= 0) {
				  subSeq += sample.charAt(index); 
			  }
		  }
		  strs.add(subSeq);
	  }
	  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strs = new ArrayList<>();
		String sample = "abcd";
		
		produceSubsequence(strs,sample);
		SortedSubsequence obj = new SortedSubsequence();
		Collections.sort(strs,obj.new LexicoWithLengthComparator());
		for(String s:strs)
			System.out.print(s+", ");

	}

}
