package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LegicographicallySmallestString {
	class MyComparator implements Comparator<String>{

		@Override
		public int compare(String s1, String s2) {
			String xy=s1+s2;
			String yx=s2+s1;
			return xy.compareTo(yx);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr= {"a","ab","aba"};
		List<String> arr = new ArrayList<>(Arrays.asList(strArr));
		Collections.sort(arr,new LegicographicallySmallestString().new MyComparator());
        String ans = "";
		for(String st:arr)
        	ans+=st;
		System.out.println("String : "+ans);
	}

}
